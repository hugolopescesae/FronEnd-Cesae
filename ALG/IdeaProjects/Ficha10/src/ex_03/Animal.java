package ex_03;

public class Animal {
    // Atributos
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    // Constructor
    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    // Método para o animal comer
    public String animalComer(String alimento, double pesoAlimento){
        for (int i = 0;i < alimentacao.length;i++){
            if (alimento.equals(alimentacao[i])){
                this.peso += (pesoAlimento/1000);
                return "O animal comeu";
            }
        }
        return "O animal recusou essa comida";
    }

    // Metodo para printar o peso

    public double getPeso() {
        return peso;
    }
}
