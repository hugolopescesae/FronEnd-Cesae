import Enums.FamiliaPlanta;

public class Planta extends SerVivo{
    // Atributos da Planta
    private FamiliaPlanta familia;
    private int grauDeDefesa;

    /**
     * Função Contrutora da Planta, que herda os atributos do SerVivo
     * @param nome
     * @param especie
     * @param pais
     * @param idade
     * @param familia
     * @param grauDeDefesa
     */
    public Planta(String nome, String especie, String pais, int idade, FamiliaPlanta familia, int grauDeDefesa) {
        super(nome, especie, pais, idade);

        if (grauDeDefesa < 0 || grauDeDefesa > 5){ // Verificação do grau de defesa introduzido quando uma planta é instanciada
            throw new IllegalArgumentException("Grau de Defesa inválido! Escolha entre 0 e 5");
        }

        this.familia = familia;
        this.grauDeDefesa = grauDeDefesa;
    }

    /**
     * Função para obter a Família da Planta
     * @return familia
     */
    public FamiliaPlanta getFamilia() {
        return familia;
    }

    /**
     * Função para obter o Grau de defesa da Planta
     * @return grauDeDefesa
     */
    public int getGrauDeDefesa() {
        return grauDeDefesa;
    }

    /**
     * Função para imprimir todos os detalhes do SerVivo
     */
    public void imprimirDetalhesPlanta() {
        imprimirDetalhesSerVivo();
        System.out.println("Família da Planta: "+this.getFamilia());
        System.out.println("Grau de Defesa: "+this.getGrauDeDefesa());
    }
}
