package Ejercicio9;

public class Prueba {
    public static void main(String[] args) {
        ProfesorEmerito profesorEmerito = new ProfesorEmerito("Oscar Ramirez", 65, 20, 10);

        double salarioBase = profesorEmerito.obtenerSalarioBase();
        System.out.println("El salario base del profesor emérito " + profesorEmerito.getNombre() + " es: " + salarioBase);
    }
}
