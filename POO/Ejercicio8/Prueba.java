package Ejercicio8;

public class Prueba {
    public static void main(String[] args) {
        AlfombraRedonda alfombra1 = new AlfombraRedonda("Roja", 50, 3);
        AlfombraCuadrada alfombra2 = new AlfombraCuadrada("Azul", 30, 4);
        
        Habitacion habitacion1 = new Habitacion("Sala de Estar");
        habitacion1.agregarAlfombra(alfombra1);
        habitacion1.agregarAlfombra(alfombra2);
        
        System.out.println("Precio total de las alfombras en " + habitacion1.getNombre() + ": " + habitacion1.calcularPrecioTotalAlfombras());
        System.out.println("Precio total de las alfombras cuadradas en " + habitacion1.getNombre() + ": " + habitacion1.calcularPrecioTotalAlfombrasCuadradas());
        
        Mansion mansion = new Mansion();
        mansion.agregarHabitacion(habitacion1);
        
        System.out.println("Precio total de las alfombras en la mansión: " + mansion.calcularPrecioTotalAlfombras());
        System.out.println("Precio total de las alfombras cuadradas en la mansión: " + mansion.calcularPrecioTotalAlfombrasCuadradas());
    }
}
