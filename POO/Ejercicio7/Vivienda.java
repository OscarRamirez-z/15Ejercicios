package Ejercicio7;

abstract class Vivienda {

    private String calle;
    protected double precio;
    private int superficieEnMetros;


    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
    }


    public double calcularPrecio() {
        return superficieEnMetros * 1000; 
    }

    public abstract double impuestoMunicipal();

    public void aumentarPrecio(int aumento) {
        this.precio += aumento; 
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }
}