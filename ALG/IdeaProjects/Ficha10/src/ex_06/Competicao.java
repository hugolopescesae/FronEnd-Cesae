package ex_06;

public class Competicao {
    // Atributos
    private String nomeCompeticao;
    private String pais;
    private Atleta [] listaAtetlas;
    private int counter = 0;

    // Constructor
    public Competicao(String nomeCompeticao, String pais) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        listaAtetlas = new Atleta[3];
    }

    // Adicionar atletas
    public String adicionarAtletas(Atleta atleta){
        listaAtetlas[counter++] = atleta;
        return "Atleta adicionado com sucesso!";
    }

    // Exibir competição
    public void exibirCompeticao(){
        System.out.println("Nome da Competição: "+this.nomeCompeticao);
        System.out.println("País: "+this.pais);
        System.out.println();
        for (int i = 0;i < listaAtetlas.length;i++){
            listaAtetlas[i].exibirAtleta();
        }
    }
}
