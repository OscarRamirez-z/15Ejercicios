package Ejercicio5;

public class CongeladoPorAire extends ProductoCongelado {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public CongeladoPorAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono, double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Composición del aire: N2: " + porcentajeNitrogeno + "%, O2: " + porcentajeOxigeno + "%, CO2: " + porcentajeDioxidoCarbono + "%, H2O: " + porcentajeVaporAgua + "%");
    }
}
