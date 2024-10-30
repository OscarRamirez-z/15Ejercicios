package Ejercicio11;

class CarneCongeladaEntera extends CarneCongelada {
    private boolean enBandeja;

    public CarneCongeladaEntera(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora, boolean enBandeja) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.enBandeja = enBandeja;
    }

    public boolean isEnBandeja() {
        return enBandeja;
    }

    @Override
    public String toString() {
        return super.toString() + ", En bandeja: " + (enBandeja ? "Sí" : "No");
    }
}
