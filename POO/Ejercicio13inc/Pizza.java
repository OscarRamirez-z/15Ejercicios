package Ejercicio13inc;

import java.util.ArrayList;

class Pizza extends Receta {
    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return 2 + getNombre().length(); 
    }

    @Override
    public boolean isVegetariano() {
        for (String ingrediente : getIngredientes()) {
            if (ingrediente.toLowerCase().contains("carne")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";
    }
}
