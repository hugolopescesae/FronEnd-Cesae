public class Inseto extends SerVivo{
    // Atributos do Inseto
    private boolean venenoso;

    /**
     * Função Construtora do Inseto, que herda os atributos do SerVivo
     * @param nome
     * @param especie
     * @param pais
     * @param idade
     * @param venenoso
     */
    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }

    /**
     * Função para obter se o Inseto é Venenoso
     * @return venenoso
     */
    public boolean isVenenoso() {
        return venenoso;
    }

    /**
     * Função para imprimir todos os detalhes do Inseto
     */
    public void imprimirDetalhesInseto() {
        imprimirDetalhesSerVivo();
        System.out.println("Venenoso: "+this.venenoso);
    }
}
