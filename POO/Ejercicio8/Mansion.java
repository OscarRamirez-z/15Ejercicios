package Ejercicio8;

class Mansion {
    private Habitacion[] arrayHabitaciones;
    private int contador;

    public Mansion() {
        this.arrayHabitaciones = new Habitacion[5];
        this.contador = 0;
    }

    public boolean agregarHabitacion(Habitacion hab) {
        if (contador < arrayHabitaciones.length) {
            arrayHabitaciones[contador++] = hab;
            return true; 
        }
        return false; 
    }

    public double calcularPrecioTotalAlfombras() {
        double total = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            if (habitacion != null) {
                total += habitacion.calcularPrecioTotalAlfombras();
            }
        }
        return total;
    }

    public double calcularPrecioTotalAlfombrasCuadradas() {
        double total = 0;
        for (Habitacion habitacion : arrayHabitaciones) {
            if (habitacion != null) {
                total += habitacion.calcularPrecioTotalAlfombrasCuadradas();
            }
        }
        return total;
    }
}
