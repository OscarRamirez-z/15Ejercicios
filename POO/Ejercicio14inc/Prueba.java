package Ejercicio14inc;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú del Garaje:");
            System.out.println("1. Alquilar una plaza");
            System.out.println("2. Baja de alquiler");
            System.out.println("3. Consulta de ingresos mensuales");
            System.out.println("4. Consulta proporción coches/motos");
            System.out.println("5. Listado de matrículas y cuota mensual");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el precio del vehículo: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cilindrada del vehículo: ");
                    int cilindrada = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la matrícula del vehículo: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Es una moto con sidecar? (true/false): ");
                    boolean tieneSidecar = scanner.nextBoolean();
                    if (tieneSidecar) {
                        Moto moto = new Moto(marca, precio, cilindrada, tieneSidecar);
                        if (moto.matricular(matricula)) {
                            try {
                                garaje.alquilarPlaza(moto);
                            } catch (SinMatriculaException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    } else {
                        System.out.print("Es un coche con radio? (true/false): ");
                        boolean tieneRadio = scanner.nextBoolean();
                        System.out.print("Es un coche con navegador? (true/false): ");
                        boolean tieneNavegador = scanner.nextBoolean();
                        Coche coche = new Coche(marca, precio, cilindrada, tieneRadio, tieneNavegador);
                        if (coche.matricular(matricula)) {
                            try {
                                garaje.alquilarPlaza(coche);
                            } catch (SinMatriculaException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la matrícula del vehículo a dar de baja: ");
                    String matriculaBaja = scanner.nextLine();
                    garaje.bajaAlquiler(matriculaBaja);
                    break;
                case 3:
                    try {
                        double ingresos = garaje.calcularIngresos();
                        System.out.println("Ingresos mensuales: " + ingresos);
                    } catch (VamosALaQuiebraException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    int numMotos = garaje.calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false));
                    int numCoches = garaje.calcularOcupacionPorTipoVehiculo(new Coche("", 0, 0, false, false));
                    System.out.println("Número de motos: " + numMotos);
                    System.out.println("Número de coches: " + numCoches);
                    break;
                case 5:
                    for (Vehiculo vehiculo : garaje.getPlazas()) {
                        System.out.println("Matrícula: " + vehiculo.getMatricula() +
                                ", Cuota mensual: " + vehiculo.getCuotaMesGarage() +
                                ", Tipo: " + vehiculo.getClass().getSimpleName());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
