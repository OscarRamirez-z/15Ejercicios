package Ejercicio9;

class ProfesorEmerito extends Profesor {
    private int añosEmerito;

    public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }

    public double obtenerSalarioBase() {

        return 925 + añosConsolidados * 12.25 + 23.40 * añosEmerito;
    }

    public int getAñosEmerito() {
        return añosEmerito;
    }
}
