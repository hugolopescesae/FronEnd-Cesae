package ex_05;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String email;
    private int telemovel;

    // Constructor
    public Pessoa(String nome, int idade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    // Gettters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return telemovel;
    }
}
