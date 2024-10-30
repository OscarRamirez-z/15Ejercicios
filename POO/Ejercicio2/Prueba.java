package Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        // Crear empleados y programadores
        Empleado empleado1 = new Empleado("Oscar Julian", "12345678A", 30, false, 3000);
        Empleado empleado2 = new Empleado("Ramirez Trujillo", "87654321B", 20, true, 2500);

        Programador programador1 = new Programador("Oscar Ramirez", "56789012C", 27, false, 4000, 50, "Java");
        Programador programador2 = new Programador("Julian Trujillo", "34567890D", 40, true, 4500, 70, "Python");

        // Imprimir los datos de cada empleado y programador
        System.out.println("=== Empleados ===");
        System.out.println(empleado1);
        System.out.println("\n" + empleado2);

        System.out.println("\n=== Programadores ===");
        System.out.println(programador1);
        System.out.println("\n" + programador2);

        // Probar método subirSalario()
        System.out.println("\nSubiendo salario a empleado y programador en un 10%:");
        empleado1.subirSalario(10);
        programador1.subirSalario(10);

        System.out.println("\nDespués de subida de salario:");
        System.out.println(empleado1);
        System.out.println("\n" + programador1);
    }
}
