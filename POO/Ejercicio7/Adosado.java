package Ejercicio7;

class Adosado extends Vivienda {
    private int numPlantas;

    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public double impuestoMunicipal() {
        return calcularPrecio() * 0.05;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }
}