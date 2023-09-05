package ex_04;

public class Circulo {

    // Atributos
    private double raio;
    private final double PI = 3.1416;

    // Constructor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getters
    public double getRaio() {
        return raio;
    }

    public double getPI() {
        return PI;
    }
}
