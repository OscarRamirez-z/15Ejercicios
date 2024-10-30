package Ejercicio10;

import java.util.HashMap;

class Biberia {
    private Aeropuerto[] aeropuertos;
    private HashMap<String, Pasajero> pasajeros;

    public Biberia(Aeropuerto[] aeropuertos) {
        this.aeropuertos = aeropuertos;
        this.pasajeros = new HashMap<>();
    }

    public void registrarPasajero(Pasajero pasajero, Avion avion) {

        pasajeros.put(pasajero.getNombre(), pasajero);
        
        if (avion instanceof AvionPasajeros) {
            ((AvionPasajeros) avion).agregarPasajero(pasajero);
        } else if (avion instanceof Avioneta) {
            ((Avioneta) avion).agregarPasajero(pasajero);
        }
    }

    public String obtenerInformacionPasajero(String nombrePasajero) {
        Pasajero pasajero = pasajeros.get(nombrePasajero);
        if (pasajero != null) {
            for (Aeropuerto aeropuerto : aeropuertos) {
                for (Avion avion : aeropuerto.getAviones()) {
                    if (avion instanceof AvionPasajeros) {
                        for (Pasajero p : ((AvionPasajeros) avion).getPasajeros()) {
                            if (p.getNombre().equals(nombrePasajero)) {
                                return "Pasajero: " + nombrePasajero + ", Aeropuerto: " + aeropuerto.getNombre() + ", Avión: " + avion.nombre;
                            }
                        }
                    } else if (avion instanceof Avioneta) {
                        for (Pasajero p : ((Avioneta) avion).getPasajeros()) {
                            if (p.getNombre().equals(nombrePasajero)) {
                                return "Pasajero: " + nombrePasajero + ", Aeropuerto: " + aeropuerto.getNombre() + ", Avión: " + avion.nombre;
                            }
                        }
                    }
                }
            }
        }
        return "Pasajero no encontrado.";
    }
}