package Ejercicio5;

public class CongeladoPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public CongeladoPorNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, String metodoCongelacion, int tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Método de congelación: " + metodoCongelacion + ", Tiempo de exposición: " + tiempoExposicion + " segundos");
    }
}
