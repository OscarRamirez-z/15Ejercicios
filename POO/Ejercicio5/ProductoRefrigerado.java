package Ejercicio5;

public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private String fechaEnvasado;
    private double tempMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismo, String fechaEnvasado, double tempMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.tempMantenimiento = tempMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código del organismo: " + codigoOrganismo + ", Fecha de envasado: " + fechaEnvasado + ", Temperatura de mantenimiento: " + tempMantenimiento + "°C, País de origen: " + paisOrigen);
    }
}