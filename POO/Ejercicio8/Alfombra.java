package Ejercicio8;

abstract class Alfombra implements iAlfombras {

    private String color;
    private int precioMetro;

    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    @Override
    public abstract double calcularSuperficie();

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * precioMetro;
    }
}
