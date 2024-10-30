package Ejercicio1;

public class CuentaAhorro extends Cuenta {
    private double saldoMinimo;

    public CuentaAhorro(long numeroCuenta, Persona cliente, double saldoMinimo) {
        super(numeroCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public void retirar(double x) {
        if (x > 0 && (getSaldo() - x) >= saldoMinimo) {
            super.retirar(x);
        } else {
            System.out.println("El importe a retirar debe ser mayor que 0 y no debe hacer que el saldo sea inferior al saldo mínimo.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta Ahorro [Número de Cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo() + ", Cliente: " + getCliente().getNombre() + ", Saldo Mínimo: " + saldoMinimo + "]";
    }
}