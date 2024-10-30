package Ejercicio11;

class Pescado extends ProductoBase {
    private String tipoPescado;

    public Pescado(String nombre, double peso, double precioKilo, String tipoPescado) {
        super(nombre, peso, precioKilo);
        this.tipoPescado = tipoPescado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de pescado: " + tipoPescado;
    }
}
