package Ejercicio13inc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);
        
        restaurante.crearReceta("Pizza Margherita", new ArrayList<>(List.of("Masa", "Tomate", "Queso", "Albahaca")), 
                                 new ArrayList<>(List.of("Hacer la masa", "Agregar ingredientes", "Hornear")), true);
        restaurante.crearReceta("Sandwich Vegetal", new ArrayList<>(List.of("Pan", "Lechuga", "Tomate", "Aguacate")), 
                                 new ArrayList<>(List.of("Tostar el pan", "Agregar ingredientes", "Servir")), false);
        
        restaurante.anadirRecetaAlMenu(restaurante.getMapaRecetasRestaurante().get("Pizza Margherita"));
        restaurante.anadirRecetaAlMenu(restaurante.getMapaRecetasRestaurante().get("Sandwich Vegetal"));
        
        System.out.println("¿Desea añadir otra receta al menú? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            restaurante.anadirRecetaAlMenu();
        }

        double tiempoMedio = restaurante.tiempoMedio();
        if (tiempoMedio == -1) {
            System.out.println("El menú está vacío, no se puede calcular el tiempo medio.");
        } else {
            System.out.println("Tiempo medio de preparación: " + tiempoMedio);
        }

        double porcentajeVegetariano = restaurante.porcentajeVegetariano();
        System.out.printf("Porcentaje de recetas vegetarianas: %.2f%%\n", porcentajeVegetariano);
        
        scanner.close();
    }
}