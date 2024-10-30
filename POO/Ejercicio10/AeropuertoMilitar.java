package Ejercicio10;

class AeropuertoMilitar extends Aeropuerto {
    private String nombreEnClave;

    public AeropuertoMilitar(String nombre, String ciudad, String nombreEnClave) {
        super(nombre, ciudad);
        this.nombreEnClave = nombreEnClave;
    }

    public String getNombreEnClave() {
        return nombreEnClave;
    }

    @Override
    public String obtenerInformacionAviones() {
        return super.obtenerInformacionAviones() + " (Aeropuerto Militar)";
    }
}