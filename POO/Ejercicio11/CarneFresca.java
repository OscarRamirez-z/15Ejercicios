package Ejercicio11;

class CarneFresca extends Carne {
    private int diasCaducidad;

    public CarneFresca(String nombre, double peso, double precioKilo, String origen, int diasCaducidad) {
        super(nombre, peso, precioKilo, origen);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Días de caducidad: " + diasCaducidad;
    }
}
