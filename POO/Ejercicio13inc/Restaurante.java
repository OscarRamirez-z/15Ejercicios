package Ejercicio13inc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Restaurante {
    private HashMap<String, IFastFood> mapaRecetasRestaurante;
    private Menu menu;

    public Restaurante() {
        mapaRecetasRestaurante = new HashMap<>();
        menu = new Menu();
    }

    public void crearReceta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion, boolean esPizza) {
        IFastFood receta;
        if (esPizza) {
            receta = new Pizza(nombre, ingredientes, pasosPreparacion);
        } else {
            receta = new Sandwich(nombre, ingredientes, pasosPreparacion);
        }
        mapaRecetasRestaurante.put(nombre, receta);
    }

    public void anadirRecetaAlMenu(IFastFood receta) {
        menu.getElementos().add(receta);
    }

    public void anadirRecetaAlMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una receta por su nombre:");
        for (String nombre : mapaRecetasRestaurante.keySet()) {
            System.out.println(nombre);
        }
        String nombreReceta = scanner.nextLine();
        IFastFood receta = mapaRecetasRestaurante.get(nombreReceta);
        if (receta != null) {
            menu.getElementos().add(receta);
            System.out.println("Receta añadida al menú.");
        } else {
            System.out.println("Receta no encontrada.");
        }
    }

    public double tiempoMedio() {
        if (menu.getElementos().isEmpty()) {
            return -1;
        }
        double sumaTiempos = 0;
        for (IFastFood receta : menu.getElementos()) {
            sumaTiempos += receta.tiempoDePreparacion();
        }
        return sumaTiempos / menu.getElementos().size();
    }

    public double porcentajeVegetariano() {
        if (menu.getElementos().isEmpty()) {
            return 0;
        }
        int contadorVegetarianos = 0;
        for (IFastFood receta : menu.getElementos()) {
            if (receta.isVegetariano()) {
                contadorVegetarianos++;
            }
        }
        return (contadorVegetarianos * 100.0) / menu.getElementos().size();
    }

    public HashMap<String, IFastFood> getMapaRecetasRestaurante() {
        return mapaRecetasRestaurante;
    }
    public Menu getMenu() {
        return menu;
    }
}
