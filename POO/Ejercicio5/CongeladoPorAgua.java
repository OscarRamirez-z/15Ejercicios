package Ejercicio5;

public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public CongeladoPorAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salinidad del agua: " + salinidadAgua + " g/L");
    }
}
