package Ejercicio10;

import java.util.ArrayList;

class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected ArrayList<Avion> aviones;

    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public boolean agregarAvion(Avion avion) {
        return aviones.add(avion);
    }

    public String obtenerInformacionAviones() {
        StringBuilder info = new StringBuilder("Aeropuerto: " + nombre + ", Ciudad: " + ciudad + "\nAviones:\n");
        for (Avion avion : aviones) {
            info.append(avion.obtenerInformacion()).append("\n");
        }
        return info.toString();
    }
}