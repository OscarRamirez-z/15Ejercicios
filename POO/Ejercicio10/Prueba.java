package Ejercicio10;

public class Prueba {
    public static void main(String[] args) {
 
        AeropuertoComercial aeropuerto1 = new AeropuertoComercial("Aeropuerto A", "Ciudad A", 2);
        AeropuertoComercial aeropuerto2 = new AeropuertoComercial("Aeropuerto B", "Ciudad B", 3);
        AeropuertoMilitar aeropuertoMilitar = new AeropuertoMilitar("Aeropuerto C", "Ciudad C", "Clave C");

        AvionPasajeros avion1 = new AvionPasajeros("Avión Pasajero 1", "MATRICULA1", 1000);
        AvionCarga avion2 = new AvionCarga("Avión de Carga 1", "MATRICULA2", 1500, 20000);
        Avioneta avion3 = new Avioneta("Avioneta 1", "MATRICULA3", 500);

        aeropuerto1.agregarAvion(avion1);
        aeropuerto2.agregarAvion(avion2);
        aeropuertoMilitar.agregarAvion(avion3);

        Pasajero pasajero1 = new Pasajero("Oscar Ramirez", "12345678A", 30);
        Pasajero pasajero2 = new Pasajero("Julian Trujillo", "87654321B", 25);

        Biberia biberia = new Biberia(new Aeropuerto[]{aeropuerto1, aeropuerto2, aeropuertoMilitar});
        biberia.registrarPasajero(pasajero1, avion1);
        biberia.registrarPasajero(pasajero2, avion1);

        System.out.println(aeropuerto1.obtenerInformacionAviones());
        System.out.println(aeropuerto2.obtenerInformacionAviones());
        System.out.println(aeropuertoMilitar.obtenerInformacionAviones());

        String infoPasajero = biberia.obtenerInformacionPasajero("Oscar Ramirez");
        System.out.println(infoPasajero);
    }
}