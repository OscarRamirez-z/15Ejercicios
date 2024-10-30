package Ejercicio11;

class Carne extends ProductoBase {
    protected String origen; 

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        super(nombre, peso, precioKilo);
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() + ", Origen: " + origen;
    }
}
