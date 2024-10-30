package Ejercicio5;

public class Prueba {
    public static void main(String[] args) {
        Producto[] productos = new Producto[10];

        productos[0] = new ProductoFresco("2025-01-05", 101, "2025-01-04", "Colombia");
        productos[1] = new ProductoFresco("2025-02-05", 102, "2025-02-04", "Argentina");

        productos[2] = new ProductoRefrigerado("2025-03-05", 201, "ORG123", "2025-03-04", 4.0, "Francia");
        productos[3] = new ProductoRefrigerado("2025-04-05", 202, "ORG124", "2025-04-04", 5.0, "Italia");
        productos[4] = new ProductoRefrigerado("2025-05-05", 203, "ORG125", "2025-05-04", 3.5, "Alemania");

        productos[5] = new CongeladoPorAire("2025-06-05", 301, "2025-06-04", "Brasil", -18.0, 78.0, 21.0, 0.03, 0.97);
        productos[6] = new CongeladoPorAire("2025-07-05", 302, "2025-07-04", "Argentina", -20.0, 80.0, 19.0, 0.02, 0.98);

        productos[7] = new CongeladoPorAgua("2025-08-05", 401, "2025-08-04", "Chile", -18.0, 3.5);
        productos[8] = new CongeladoPorAgua("2025-09-05", 402, "2025-09-04", "Uruguay", -20.0, 4.0);

        productos[9] = new CongeladoPorNitrogeno("2025-10-05", 501, "2025-10-04", "Perú", -22.0, "Inmersión", 300);

        for (Producto producto : productos) {
            producto.mostrarInformacion();
            System.out.println("-----------------------------------");
        }
    }
}
