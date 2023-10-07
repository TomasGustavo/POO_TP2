package ar.edu.unlu.poo.tp2;

import java.time.LocalTime;
import java.util.ArrayList;

public class Academia {
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    public void agregarDisciplina(String nombre){
        Disciplina disciplina = new Disciplina(nombre);
        disciplinas.add(disciplina);
    }

    public String disciplinaMasRedituable(){
        Disciplina masRedituable = disciplinas.get(0);
        for (Disciplina disciplina : disciplinas){
            if (disciplina.calcularRedito() > masRedituable.calcularRedito()){
                masRedituable = disciplina;
            }
        }
        return "La disciplina mas redituable es " + masRedituable.getNombre() +
                " con un rédito de $" + masRedituable.calcularRedito() + " mensual";
    }

    public boolean agregarComision(String nombreDisciplina,String dias, LocalTime hora, Nivel nivel,
                                   Profesor profesor, String salon){
        for (Disciplina disciplina : disciplinas){
            if(disciplina.getNombre().equals(nombreDisciplina)){
                Comision com = disciplina.agregarComision(dias, hora, nivel,profesor,salon);
                profesor.agregarComision(com);
                return true;
            }
        }
        return false;
    }

    public void inscribirAlumno(String nombre, String apellido, String dni, String mail,
                                String telefono){
        Alumno alumno = new Alumno(nombre,apellido,dni,mail,telefono);
        alumnos.add(alumno);
    }

    public boolean anotarAlumnoAComision(String nombredisciplina, int comision, String dni) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNombre().equals(nombredisciplina)) {
                if (disciplina.obtenerComision(comision) != null) {
                    for (Alumno alumno : alumnos) {
                        if (alumno.getDni().equals(dni)) {
                            alumno.anotarseAComision(disciplina.obtenerComision(comision));
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean anotarAsistencia(String dni, int comision){
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                alumno.asistirAClase(comision);
            }
        }
        return false;
    }
}