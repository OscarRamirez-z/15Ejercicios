package Ejercicio5;

public class Producto {
    protected String fechaCaducidad;
    protected int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void mostrarInformacion() {
        System.out.println("Fecha de caducidad: " + fechaCaducidad + ", Número de lote: " + numeroLote);
    }
}
