import ar.edu.unlu.poo.tp2.Academia;
import ar.edu.unlu.poo.tp2.Alumno;
import ar.edu.unlu.poo.tp2.Nivel;
import ar.edu.unlu.poo.tp2.Profesor;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia();
        //Agrega dos disciplinas
        academia.agregarDisciplina("Flamenco");
        academia.agregarDisciplina("Tango");

        //Agrega dos profesores
        Profesor profesor1 = new Profesor("tomas", "loaicono");
        Profesor profesor2 = new Profesor("delfina", "artigas");

        //Crea 4 comimsiones
        academia.agregarComision("Flamenco", "Lunes y jueves",
                LocalTime.of(15,30), Nivel.INTERMEDIO, profesor2,
                "3");
        academia.agregarComision("Flamenco", "Martes y Miercoes",
                LocalTime.of(17,00), Nivel.AVANZADO, profesor2,
                "1");
        academia.agregarComision("Tango", "Lunes y Viernes",
                LocalTime.of(10,30), Nivel.INICIAL, profesor1,
                "5");
        academia.agregarComision("Tango", "Miercoles y Sabados",
                LocalTime.of(13,15), Nivel.INTERMEDIO, profesor1,
                "4");

        // Inscribe 3 alumnos
        academia.inscribirAlumno("Juan", "Perez", "34625743",
                "JP@gmail.com", "1123417585");
        academia.inscribirAlumno("Marta", "Lopez", "7823456",
                "Marta@gmail.com", "3215545");
        academia.inscribirAlumno("Jimena", "hernandez", "1234514",
                "jimena@gmail.com", "62346112");

        // Anota a los alumnos a la comision que quieren
        academia.anotarAlumnoAComision("Flamenco", 2,"34625743");
        academia.anotarAlumnoAComision("Flamenco", 1, "7823456");
        academia.anotarAlumnoAComision("Tango", 3, "1234514");

        //Alumno 1 asiste 3 veces a clases de la comision 2
        academia.anotarAsistencia("34625743",2);
        academia.anotarAsistencia("34625743",2);
        academia.anotarAsistencia("34625743",2);

        //Alumno 2 asiste 2 veces a clases de la comision 1
        academia.anotarAsistencia("7823456",1);
        academia.anotarAsistencia("7823456",1);

        //Alumno 3 asiste 6 veces a clases de la comision 3
        academia.anotarAsistencia("1234514",3);
        academia.anotarAsistencia("1234514",3);
        academia.anotarAsistencia("1234514",3);
        academia.anotarAsistencia("1234514",3);
        academia.anotarAsistencia("1234514",3);
        academia.anotarAsistencia("1234514",3);
        //Se calcula el sueldo del profesor 2(profesor de comisiones 1 y 2)
        //Deberia ser de $50
        System.out.println("Sueldo del profesor " + profesor2.getNombreCompleto() +
                ": $" + profesor2.calcularSueldo());

        //Se calcula el sueldo del profesor 1(profesor de comisiones 3 y 4)
        //Deberia ser de $60
        System.out.println("Sueldo del profesor " + profesor1.getNombreCompleto() +
                ": $" + profesor1.calcularSueldo());

        System.out.println(academia.disciplinaMasRedituable());
    }
}