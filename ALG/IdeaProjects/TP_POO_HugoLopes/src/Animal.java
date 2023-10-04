import Enums.AlimentacaoAnimal;

public class Animal extends SerVivo{
    // Atributos
    private boolean fome;
    private double peso;
    private double inteligencia;
    private AlimentacaoAnimal Alimentacao;

    // Método Construtor
    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, AlimentacaoAnimal alimentacao) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        Alimentacao = alimentacao;
    }
}
