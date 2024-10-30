package Ejercicio8;

class AlfombraCuadrada extends Alfombra {
    private int lado;

    public AlfombraCuadrada(String color, int precioMetro, int lado) {
        super(color, precioMetro);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularSuperficie() {
        return Math.pow(lado, 2); 
    }
}
