package Ejercicio2;

public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    // Constructor con parámetros
    public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    // Constructor sin parámetros
    public Programador() {
        super();
        this.lineasDeCodigoPorHora = 0;
        this.lenguajeDominante = "";
    }

    // Método para calcular el salario del programador
    public double calculaSalario() {
        return 10 * lineasDeCodigoPorHora;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nLíneas de Código por Hora: " + lineasDeCodigoPorHora + "\nLenguaje Dominante: " + lenguajeDominante;
    }
}
