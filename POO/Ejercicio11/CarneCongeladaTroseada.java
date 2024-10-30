package Ejercicio11;

class CarneCongeladaTroceada extends CarneCongelada {
    private int piezas;

    public CarneCongeladaTroceada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora, int piezas) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Piezas: " + piezas;
    }
}
