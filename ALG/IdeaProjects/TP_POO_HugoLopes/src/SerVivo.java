public class SerVivo {
    // Atributos do SerVivo
    private String nome;
    private String especie;
    private String pais;
    private int idade;

    /**
     * Função Construtora do SerVivo
     * @param nome
     * @param especie
     * @param pais
     * @param idade
     */
    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    /**
     * Função para obter o nome do SerVivo
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Função para obter a espécie do SerVivo
     * @return especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Função para obter o país do SerVivo
     * @return pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Função para obter a idade do SerVivo
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Função para imprimir todos os detalhes do SerVivo
     */
    public void imprimirDetalhesSerVivo() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Espécie: "+this.especie);
        System.out.println("País: "+this.pais);
        System.out.println("Idade: "+this.idade);
    }
}
