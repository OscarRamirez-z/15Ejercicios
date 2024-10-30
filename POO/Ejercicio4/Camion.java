package Ejercicio4;

public class Camion extends Vehiculo {
    private double tamañoRemolque;
    private int numEjes;

    public Camion(double precioCompra, String marca, double tamañoRemolque, int numEjes) {
        super(precioCompra, marca);
        this.tamañoRemolque = tamañoRemolque;
        this.numEjes = numEjes;
    }

    @Override
    public double precioVenta() {
        return precioBaseVenta * numEjes; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamaño del remolque: " + tamañoRemolque + " m, Número de ejes: " + numEjes;
    }
}
