package Ejercicio13inc;

import java.util.ArrayList;

class Sandwich extends Receta {
    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        int vocales = 0;
        for (char c : getNombre().toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vocales++;
            }
        }
        return 2 + vocales; 
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "plancha";
    }
}
