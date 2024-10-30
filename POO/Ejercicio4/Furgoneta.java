package Ejercicio4;

public class Furgoneta extends Vehiculo {
    private double capacidadCarga;

    public Furgoneta(double precioCompra, String marca, double capacidadCarga) {
        super(precioCompra, marca);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        double precioFinal = precioBaseVenta;
        if (capacidadCarga > 10) {
            precioFinal *= 1.2;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad de carga: " + capacidadCarga + " m³";
    }
}
