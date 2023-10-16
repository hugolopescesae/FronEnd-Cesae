import Enums.AlimentacaoAnimal;

public class Animal extends SerVivo{
    // Atributos do Animal
    private boolean fome;
    private double peso;
    private int inteligencia;
    private AlimentacaoAnimal alimentacao;
    private String barulho;

    /**
     * Função Contrutora do Animal, que herda os atributos do SerVivo
     * @param nome
     * @param especie
     * @param pais
     * @param idade
     * @param fome
     * @param peso
     * @param inteligencia
     * @param alimentacao
     * @param barulho
     */
    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, int inteligencia, AlimentacaoAnimal alimentacao, String barulho) {
        super(nome, especie, pais, idade);

        if (inteligencia < 0 || inteligencia > 100){ // Verificação da inteligência introduzida quando um Animal é instanciado
            throw new IllegalArgumentException("Quantidade de Inteligência inválida! Insira um valor entre 0 e 100");
        }

        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.alimentacao = alimentacao;
        this.barulho = barulho;
    }

    /**
     * Função para obter o barulho do Animal
     * @return barulho
     */
    public String getBarulho() {
        return barulho;
    }

    /**
     * Função para obter o peso do Animal
     * @return peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Função para obter se o Animal tem fome
     * @return fome
     */
    public boolean isFome() {
        return fome;
    }

    /**
     * Função para obter a inteligência do Animal
     * @return inteligencia
     */
    public int getInteligencia() {
        return inteligencia;
    }

    /**
     * Função para obter a alimentação do Animal
     * @return alimentacao
     */
    public AlimentacaoAnimal getAlimentacao() {
        return alimentacao;
    }

    /**
     * Função para definir a fome atual do Animal
     * @param fome
     */
    public void setFome(boolean fome) {
        this.fome = fome;
    }

    /**
     * Função para imprimir todos os detalhes do Animal
     */
    public void imprimirDetalhesAnimal() {
        imprimirDetalhesSerVivo();
        System.out.println("Fome: "+this.fome);
        System.out.println("Peso: "+this.peso);
        System.out.println("Inteligencia: "+this.inteligencia);
        System.out.println("Alimentação: "+this.alimentacao);
        System.out.println("Barulho: "+this.barulho);
    }
}
