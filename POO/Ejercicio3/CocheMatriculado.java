package Ejercicio3;

public class CocheMatriculado extends Coche {
    private int anioMatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    public CocheMatriculado(String marca, String color, double precio, double factorContaminacion, int anio, 
                            String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion) {
        super(marca, color, precio, factorContaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        this.anioMatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    public int getAnioMatriculacion() {
        return anioMatriculacion;
    }

    public void setAnioMatriculacion(int anioMatriculacion) {
        this.anioMatriculacion = anioMatriculacion;
    }

    public int getMesMatriculacion() {
        return mesMatriculacion;
    }

    public void setMesMatriculacion(int mesMatriculacion) {
        this.mesMatriculacion = mesMatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void calculaImpuestoMatriculacion() {
        impuestoMatriculacion = getPrecio() / 20;
        if ((2023 - getAnio()) > 10) {
            impuestoMatriculacion += 100;
        }
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCocheMatriculado{" +
                "anioMatriculacion=" + anioMatriculacion +
                ", mesMatriculacion=" + mesMatriculacion +
                ", impuestoMatriculacion=" + impuestoMatriculacion +
                '}';
    }
}
