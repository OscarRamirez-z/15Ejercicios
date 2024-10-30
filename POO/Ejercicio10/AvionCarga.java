package Ejercicio10;

class AvionCarga extends Avion {
    private int cargaMaxima;

    public AvionCarga(String nombre, String matricula, int autonomiaVuelo, int cargaMaxima) {
        super(nombre, matricula, autonomiaVuelo);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String obtenerInformacion() {
        return "Avión de Carga: " + nombre + ", Matrícula: " + matricula + ", Autonomía: " + autonomiaVuelo + " km, Carga Máxima: " + cargaMaxima + " kg";
    }
}