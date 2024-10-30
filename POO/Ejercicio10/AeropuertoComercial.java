package Ejercicio10;

class AeropuertoComercial extends Aeropuerto {
    private int numeroTerminales;

    public AeropuertoComercial(String nombre, String ciudad, int numeroTerminales) {
        super(nombre, ciudad);
        this.numeroTerminales = numeroTerminales;
    }

    public int getNumeroTerminales() {
        return numeroTerminales;
    }

    @Override
    public String obtenerInformacionAviones() {
        return super.obtenerInformacionAviones() + " (Aeropuerto Comercial, Terminales: " + numeroTerminales + ")";
    }
}