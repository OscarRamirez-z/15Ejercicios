package Ejercicio14inc;

public class Vehiculo {
    private String matricula;
    private String marca;
    private double precio;
    private int cilindrada;
    private double impuestoCirculacion;
    private double cuotaMesGarage;

    private static final double CUOTA_BASE = 100.0; // Constante de clase

    public Vehiculo(String marca, double precio, int cilindrada) {
        this.marca = marca;
        this.precio = precio;
        this.cilindrada = cilindrada;
        this.cuotaMesGarage = CUOTA_BASE;
        calcularImpuestoCirculacion();
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02; // 2% del precio
    }

    public boolean matricular(String matricula) {
        if (matricula.length() == 7) {
            this.matricula = matricula;
            return true;
        }
        return false;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public double getCuotaMesGarage() {
        return cuotaMesGarage;
    }

    public void setCuotaMesGarage(double cuotaMesGarage) {
        if (cuotaMesGarage < 0) {
        }
        this.cuotaMesGarage = cuotaMesGarage;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;
    }
}