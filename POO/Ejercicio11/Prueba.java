package Ejercicio11;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Calculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué tipo de producto desea añadir? (carne/pescado)");
                    String tipoProducto = scanner.nextLine().toLowerCase();
                    if (tipoProducto.equals("carne")) {
                        System.out.println("Ingrese el nombre:");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese el peso en kilos:");
                        double peso = scanner.nextDouble();
                        System.out.println("Ingrese el precio por kilo:");
                        double precioKilo = scanner.nextDouble();
                        System.out.println("Ingrese el origen (vacuno/avícola):");
                        String origen = scanner.next();
                        System.out.println("¿Es fresca (f) o congelada (c)?");
                        char tipoCarne = scanner.next().charAt(0);
                        if (tipoCarne == 'f') {
                            System.out.println("Ingrese los días de caducidad:");
                            int diasCaducidad = scanner.nextInt();
                            almacen.agregarProducto(new CarneFresca(nombre, peso, precioKilo, origen, diasCaducidad));
                        } else if (tipoCarne == 'c') {
                            System.out.println("Ingrese la empresa distribuidora:");
                            String empresaDistribuidora = scanner.next();
                            System.out.println("¿Es entera (e) o troceada (t)?");
                            char tipoCongelada = scanner.next().charAt(0);
                            if (tipoCongelada == 'e') {
                                System.out.println("¿Viene en bandeja? (s/n)");
                                boolean enBandeja = scanner.next().charAt(0) == 's';
                                almacen.agregarProducto(new CarneCongeladaEntera(nombre, peso, precioKilo, origen, empresaDistribuidora, enBandeja));
                            } else if (tipoCongelada == 't') {
                                System.out.println("Ingrese el número medio de piezas:");
                                int piezas = scanner.nextInt();
                                almacen.agregarProducto(new CarneCongeladaTroceada(nombre, peso, precioKilo, origen, empresaDistribuidora, piezas));
                            }
                        }
                    } else if (tipoProducto.equals("pescado")) {
                        System.out.println("Ingrese el nombre:");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese el peso en kilos:");
                        double peso = scanner.nextDouble();
                        System.out.println("Ingrese el precio por kilo:");
                        double precioKilo = scanner.nextDouble();
                        System.out.println("Ingrese el tipo de pescado:");
                        String tipoPescado = scanner.next();
                        almacen.agregarProducto(new Pescado(nombre, peso, precioKilo, tipoPescado));
                    } else {
                        System.out.println("Tipo de producto no reconocido.");
                    }
                    break;

                case 2:
                    almacen.listarProductos();
                    break;

                case 3:
                    almacen.listarProductosEnPeligro();
                    break;

                case 4:
                    double precioMedio = almacen.calcularPrecioMedio();
                    System.out.println("El precio medio de los productos es: " + precioMedio + " €");
                    break;

                case 5:
                    almacen.eliminarBandejas();
                    System.out.println("Se han eliminado las bandejas de carnes congeladas.");
                    break;

                case 0:
                    System.out.println("Saliendo de la aplicación.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}