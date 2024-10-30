package Ejercicio14inc;

import java.util.ArrayList;

public class Garaje implements iGarage {
    private static final int NUM_PLAZAS = 10;
    private ArrayList<Vehiculo> plazas;

    public Garaje() {
        plazas = new ArrayList<>(NUM_PLAZAS);
    }

    public boolean alquilarPlaza(Vehiculo vehiculo) {
        if (plazas.size() >= NUM_PLAZAS) {
            System.out.println("No se pueden alquilar más plazas.");
            return false;
        }

        if (vehiculo.getMatricula() == null) {
            throw new SinMatriculaException("El vehículo no tiene matrícula.");
        }

        // Calcular cuántas motos hay
        int ocupacionMotos = calcularOcupacionPorTipoVehiculo(new Moto("", 0, 0, false));
        if (ocupacionMotos >= 0.8 * NUM_PLAZAS) {
            System.out.println("No se puede alquilar más del 80% de plazas a motos.");
            return false;
        }

        plazas.add(vehiculo);
        return true;
    }

    public void bajaAlquiler(String matricula) {
        boolean encontrado = plazas.removeIf(vehiculo -> vehiculo.getMatricula() != null && vehiculo.getMatricula().equals(matricula));
        if (!encontrado) {
            System.out.println("No se encontró el vehículo con matrícula: " + matricula);
        }
    }

    @Override
    public double calcularIngresos() {
        double total = 0;
        for (Vehiculo vehiculo : plazas) {
            total += vehiculo.getCuotaMesGarage();
        }

        if (total < 400) {
            throw new VamosALaQuiebraException("Los ingresos son menores a 400 euros.");
        }
        return total;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int count = 0;
        for (Vehiculo vehiculo : plazas) {
            if (vehiculo.getClass() == v.getClass()) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Vehiculo> getPlazas() {
        return plazas;
    }
}