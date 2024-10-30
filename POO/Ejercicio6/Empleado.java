package Ejercicio6;

public class Empleado {
    private String nombre;
    private String telefono;
    private static int numeroEmpleados = 0; // Atributo estático para contar instancias

    // Constructor
    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++; // Incrementar el contador al crear una nueva instancia
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para obtener el número de empleados
    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Teléfono: " + telefono);
    }
}