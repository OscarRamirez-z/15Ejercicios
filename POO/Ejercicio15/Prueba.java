package Ejercicio15;

public class PruebaBingo {
    public static void main(String[] args) {
        int[][] carton = {
            {0, 12, 0, 0, 43, 0, 60, 73, 85},
            {5, 0, 22, 34, 0, 55, 0, 78, 0},
            {9, 0, 0, 38, 45, 0, 69, 0, 90}
        };

        // Validar el cartón
        JuegoDelBingo juego = new JuegoDelBingo(carton);
        boolean esValido = juego.cartonValido(carton);

        // Mostrar resultado
        if (esValido) {
            System.out.println("El cartón de bingo es válido.");
        } else {
            System.out.println("El cartón de bingo no es válido.");
        }
    }
}