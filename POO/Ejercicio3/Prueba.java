package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Azul", 15000, 1.2, 2015);
        Coche coche2 = new Coche("Honda", "Rojo", 18000, 1.1, 2019);

        coche1.setDniTitular("12345678A");
        coche2.setDniTitular("87654321B");

        System.out.println("Antes de comprar:");
        System.out.println("Coche 1: " + coche1);
        System.out.println("Coche 2: " + coche2);
        
        coche1.comprarCoche(coche2);

        System.out.println("\nDespués de comprar:");
        System.out.println("Coche 1: " + coche1);

        CocheMatriculado cocheMatriculado = new CocheMatriculado("Ford", "Negro", 20000, 1.3, 2008,
                "XYZ123", "12345678C", 2023, 5);

        System.out.println("\nCoche Matriculado:");
        System.out.println(cocheMatriculado);

        cocheMatriculado.incrementarKm(5000);
        System.out.println("\nDespués de aumentar kilómetros:");
        System.out.println(cocheMatriculado);
    }
}
