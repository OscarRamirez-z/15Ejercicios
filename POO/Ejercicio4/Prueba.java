package Ejercicio4;

public class Prueba {
    public static void main(String[] args) {

        Camion[] camiones = new Camion[3];
        camiones[0] = new Camion(25000, "Volvo", 12, 4);
        camiones[1] = new Camion(22000, "Mercedes", 10, 3);
        camiones[2] = new Camion(18000, "Scania", 8, 2);

        System.out.println("Precios de venta de camiones:");
        for (Camion camion : camiones) {
            System.out.println(camion);
        }

        Furgoneta[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta(12000, "Ford", 12);
        furgonetas[1] = new Furgoneta(10000, "Renault", 8);

        System.out.println("\nPrecios de venta de furgonetas:");
        for (Furgoneta furgoneta : furgonetas) {
            System.out.println(furgoneta);
        }

        Vehiculo[] vehiculos = new Vehiculo[camiones.length + furgonetas.length];
        System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
        System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);

        System.out.println("\nPrecios de venta de todos los vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
