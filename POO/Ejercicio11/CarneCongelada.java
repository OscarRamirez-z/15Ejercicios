package Ejercicio11;

class CarneCongelada extends Carne {
    protected String empresaDistribuidora;

    public CarneCongelada(String nombre, double peso, double precioKilo, String origen, String empresaDistribuidora) {
        super(nombre, peso, precioKilo, origen);
        this.empresaDistribuidora = empresaDistribuidora;
    }

    @Override
    public String toString() {
        return super.toString() + ", Empresa distribuidora: " + empresaDistribuidora;
    }
}
