package Ejercicio1;


public class Persona {
    private String nombre;
    private String nif;

    public Persona(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }
}