package Ejercicio1;

public class CuentaCorriente extends Cuenta {
    private double maximoRetirable;


    public CuentaCorriente(long numeroCuenta, Persona cliente, double maximoRetirable) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && x <= getSaldo() && x <= maximoRetirable) {
            super.retirar(x);
        } else {
            System.out.println("El importe a retirar debe ser mayor que 0, menor o igual que el saldo y menor o igual que el máximo retirable.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Cuenta Corriente [Número de Cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + ", Cliente: " + getCliente().getNombre() + ", Máximo Retirable: " + maximoRetirable + "]";
    }
}