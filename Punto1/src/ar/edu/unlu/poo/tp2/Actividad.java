package ar.edu.unlu.poo.tp2;

public class Actividad {
    private String nombre;
    private TipoSubscripcion subscripcion;

    public Actividad(String nombre, TipoSubscripcion subscripcion){
        this.nombre = nombre;
        this.subscripcion = subscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoSubscripcion getSuscripcion() {
        return subscripcion;
    }

    void setSuscripcion(TipoSubscripcion tipo){
        this.subscripcion = tipo;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }
}