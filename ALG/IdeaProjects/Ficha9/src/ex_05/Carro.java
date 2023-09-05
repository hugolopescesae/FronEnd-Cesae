package ex_05;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int fabrico;

    // Constructor
    public Carro(String marca, String modelo, int fabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabrico = fabrico;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getFabrico() {
        return fabrico;
    }

    // Método ligar
    public void setLigar () {
        System.out.println("O carro está ligado!");
    }
}
