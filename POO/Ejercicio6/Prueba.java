package Ejercicio6;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4]; // Crear un array para 4 empleados

        // Leer datos de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el teléfono del empleado " + (i + 1) + ": ");
            String telefono = scanner.nextLine();
            empleados[i] = new Empleado(nombre, telefono); // Crear una nueva instancia de Empleado
        }

        // Mostrar datos de cada empleado
        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo(); // Mostrar información de cada empleado
        }

        // Mostrar el número total de empleados instanciados
        System.out.println("\nNúmero total de empleados: " + Empleado.getNumeroEmpleados());

        scanner.close(); // Cerrar el scanner
    }
}