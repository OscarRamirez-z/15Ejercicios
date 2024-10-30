package Ejercicio7;

public class Prueba {
    public static void main(String[] args) {

        Piso piso1 = new Piso("Calle Falsa 123", 80, 2, 5);
        Adosado adosado1 = new Adosado("Calle Verdadera 456", 150, 2);
        Chalet chalet1 = new Chalet("Calle del Sol 789", 200, 1, true);

        System.out.println("Precio Piso: " + piso1.calcularPrecio());
        System.out.println("Impuesto Municipal Piso: " + piso1.impuestoMunicipal());

        System.out.println("Precio Adosado: " + adosado1.calcularPrecio());
        System.out.println("Impuesto Municipal Adosado: " + adosado1.impuestoMunicipal());

        System.out.println("Precio Chalet: " + chalet1.calcularPrecio());
        System.out.println("Impuesto Municipal Chalet: " + chalet1.impuestoMunicipal());

        piso1.aumentarPrecio(5000);
        adosado1.aumentarPrecio(10000);
        chalet1.aumentarPrecio(15000);

        System.out.println("\nPrecios tras aumento:");
        System.out.println("Nuevo Precio Piso: " + piso1.getPrecio());
        System.out.println("Nuevo Precio Adosado: " + adosado1.getPrecio());
        System.out.println("Nuevo Precio Chalet: " + chalet1.getPrecio());
    }
}