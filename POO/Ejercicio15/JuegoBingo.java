package Ejercicio15;

import java.util.HashSet;

public class JuegoDelBingo implements iCarton {
    private int[][] carton;

    public JuegoDelBingo(int[][] carton) {
        this.carton = carton;
    }

    @Override
    public boolean cartonValido(int[][] carton) {
        // Verificar tamaño
        if (carton.length != 3 || carton[0].length != 9) {
            return false;
        }

        HashSet<Integer> numeros = new HashSet<>();
        int totalNumeros = 0;

        // Validar cada fila
        for (int i = 0; i < 3; i++) {
            int numerosFila = 0;
            for (int j = 0; j < 9; j++) {
                int numero = carton[i][j];

                // Comprobar que el número esté en el rango de 1 a 90
                if (numero < 0 || numero > 90) {
                    return false;
                }

                // Comprobar que no se repitan números
                if (numero != 0 && !numeros.add(numero)) {
                    return false; // Número ya existe
                }

                // Contar números válidos en la fila
                if (numero != 0) {
                    numerosFila++;
                }
            }

            // Comprobar que hay exactamente 5 números en cada fila
            if (numerosFila != 5) {
                return false;
            }
        }

        // Validar orden creciente en filas y columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (carton[i][j] != 0 && carton[i][j + 1] != 0) {
                    if (carton[i][j] >= carton[i][j + 1]) {
                        return false; // No están en orden creciente
                    }
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            int lastNumber = 0;
            for (int i = 0; i < 3; i++) {
                if (carton[i][j] != 0) {
                    if (carton[i][j] <= lastNumber) {
                        return false; // No están en orden creciente en la columna
                    }
                    lastNumber = carton[i][j];
                }
            }
        }

        return true; // Cartón válido
    }
}