package ex_02;

public class Cao {

    // Atributos
    private String nome;
    private String raca;
    private String latido = "Au au au!";

    // Constructor
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return latido;
    }

    // Setters
    public void setLatido(String latido) {
        this.latido = latido;
    }
}
