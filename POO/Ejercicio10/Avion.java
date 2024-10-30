package Ejercicio10;

abstract class Avion {
    protected String nombre;
    protected String matricula;
    protected int autonomiaVuelo;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public abstract String obtenerInformacion();
}