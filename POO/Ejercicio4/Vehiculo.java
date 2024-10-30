package Ejercicio4;

public abstract class Vehiculo {
    protected double precioCompra;
    protected String marca;
    protected double precioBaseVenta;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
        this.precioBaseVenta = precioCompra * 1.6; 
    }

    public abstract double precioVenta();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Precio de compra: " + precioCompra + ", Precio de venta: " + precioVenta();
    }
}