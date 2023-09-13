package ex_06;

public class Atleta {
    // Atributos
    private String nome;
    private String modalidade;
    private String altura;
    private double peso;
    private String paisOrigem;

    // Constructor
    public Atleta(String nome, String modalidade, String altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    // Exibir atleta
    public void exibirAtleta(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Modalidade: "+this.modalidade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Peso: "+this.peso);
        System.out.println("País de Origem: "+this.paisOrigem);
        System.out.println();
    }
}
