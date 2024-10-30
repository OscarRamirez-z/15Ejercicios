package Ejercicio12;

public class Prueba {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Cuadrado("Cuadrado 1", 0, 0, "Rojo", 5);
        formas[1] = new Cuadrado("Cuadrado 2", 1, 1, "Azul", 3);
        formas[2] = new Triangulo("Triángulo", 2, 2, "Verde", 4, 5);
        formas[3] = new Triangulo("Triángulo Isósceles", 3, 3, "Amarillo", 6, 8);

        double sumaAreas = 0;
        double sumaCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            sumaAreas += forma.calcularArea();
            if (forma instanceof Cuadrado) {
                sumaCuadrados += forma.calcularArea();
                contadorCuadrados++;
            }
        }

        double mediaCuadrados = contadorCuadrados > 0 ? sumaCuadrados / contadorCuadrados : 0;

        System.out.println("Suma de áreas de todas las formas: " + sumaAreas);
        System.out.println("Media de áreas de los cuadrados: " + mediaCuadrados);
    }
}
