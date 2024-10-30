package Ejercicio2;

public class Empleado {
    private String nombre;
    private String dni;
    private int edad; // Rango entre 18 y 45 años
    private boolean casado;
    private double salario;

    // Constructor con todos los parámetros
    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        setEdad(edad); // Usar el setter para validar
        this.casado = casado;
        this.salario = salario;
    }

    // Constructor sin parámetros
    public Empleado() {
        this.nombre = "";
        this.dni = "";
        this.edad = 18; // Edad mínima
        this.casado = false;
        this.salario = 0.0;
    }

    // Setter para edad con validación
    public void setEdad(int edad) {
        if (edad >= 18 && edad <= 45) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años.");
        }
    }

    // Método para clasificar según la edad
    public String clasifica() {
        if (edad <= 21) {
            return "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad + "\nCasado: " + casado + "\nSalario: " + salario;
    }

    // Método para subir el salario
    public void subirSalario(int porcentaje) {
        salario += salario * porcentaje / 100.0;
    }
}
