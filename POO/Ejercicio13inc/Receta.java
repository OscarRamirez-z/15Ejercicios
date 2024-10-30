package Ejercicio13inc;

import java.util.ArrayList;

abstract class Receta implements IFastFood {
    private String nombre;
    private ArrayList<String> ingredientes;
    private ArrayList<String> pasosPreparacion;

    public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<String> getPasosPreparacion() {
        return pasosPreparacion;
    }
}
