package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Oscar Julian Ramirez", "12345678A");
        Persona persona2 = new Persona("Ramirez Trujillo Oscar", "87654321B");

        CuentaCorriente cuentaCorriente = new CuentaCorriente(123456789012L, persona1, 500.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(987654321098L, persona2, 100.0);

        System.out.println("Prueba Cuenta Corriente:");
        cuentaCorriente.ingresar(1000.0);
        System.out.println(cuentaCorriente);
        
        cuentaCorriente.retirar(600.0);
        System.out.println(cuentaCorriente);
        
        cuentaCorriente.retirar(500.0); 
        System.out.println(cuentaCorriente);

        System.out.println("\nPrueba Cuenta Ahorro:");
        cuentaAhorro.ingresar(500.0);
        System.out.println(cuentaAhorro);
        
        cuentaAhorro.retirar(300.0);
        System.out.println(cuentaAhorro);
        
        cuentaAhorro.retirar(200.0);
        System.out.println(cuentaAhorro);
    }
}