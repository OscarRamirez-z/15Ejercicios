package Ejercicio4;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(double precioCompra, String marca, int numPuertas) {
        super(precioCompra, marca);
        this.numPuertas = numPuertas;
    }

    @Override
    public double precioVenta() {
        return precioBaseVenta;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de puertas: " + numPuertas;
    }
}