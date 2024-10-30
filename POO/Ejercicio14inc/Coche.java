package Ejercicio14inc;

public class Coche extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Coche(String marca, double precio, int cilindrada, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindrada);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;

        // Incrementar impuestos y cuota según atributos
        if (tieneRadio) {
            calcularImpuestoCirculacion();
            setCuotaMesGarage(getCuotaMesGarage() * 1.01); // 1% más
        }
        if (tieneNavegador) {
            calcularImpuestoCirculacion();
            setCuotaMesGarage(getCuotaMesGarage() * 1.02); // 2% más
        }
        if (cilindrada > 2999) {
            setCuotaMesGarage(getCuotaMesGarage() * 1.2); // Aumento del 20%
        }
    }
}