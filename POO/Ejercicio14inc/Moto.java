package Ejercicio14inc;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, double precio, int cilindrada, boolean tieneSidecar) {
        super(marca, precio, cilindrada);
        this.tieneSidecar = tieneSidecar;

        // Incrementar impuestos y cuota si tiene sidecar
        if (tieneSidecar) {
            setCuotaMesGarage(getCuotaMesGarage() * 1.5); // Aumento del 50%
            calcularImpuestoCirculacion();
            setCuotaMesGarage(getCuotaMesGarage() * 1.1); // 10% más en impuesto
        }
    }
}