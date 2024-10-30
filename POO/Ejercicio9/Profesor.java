package Ejercicio9;

class Profesor {
    protected String nombre;
    protected int edad;
    protected int añosConsolidados;

    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAñosConsolidados() {
        return añosConsolidados;
    }
}
