package Ejercicio5;

public abstract class ProductoCongelado extends Producto {
    protected String fechaEnvasado;
    protected String paisOrigen;
    protected double tempMantenimiento;

    public ProductoCongelado(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.tempMantenimiento = tempMantenimiento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado + ", País de origen: " + paisOrigen + ", Temperatura de mantenimiento: " + tempMantenimiento + "°C");
    }
}