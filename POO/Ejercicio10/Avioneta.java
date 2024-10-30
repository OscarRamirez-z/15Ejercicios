package Ejercicio10;

import java.util.ArrayList;

class Avioneta extends Avion {
    private ArrayList<Pasajero> pasajeros;

    public Avioneta(String nombre, String matricula, int autonomiaVuelo) {
        super(nombre, matricula, autonomiaVuelo);
        this.pasajeros = new ArrayList<>();
    }

    public boolean agregarPasajero(Pasajero pasajero) {
        return pasajeros.add(pasajero);
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String obtenerInformacion() {
        StringBuilder info = new StringBuilder("Avioneta: " + nombre + ", Matrícula: " + matricula + ", Autonomía: " + autonomiaVuelo + " km\nPasajeros:");
        for (Pasajero pasajero : pasajeros) {
            info.append("\n - ").append(pasajero.getNombre());
        }
        return info.toString();
    }
}