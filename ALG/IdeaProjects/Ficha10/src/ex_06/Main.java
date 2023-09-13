package ex_06;

public class Main {
    public static void main(String[] args) {
        // Intanciar Atletas e Competição
        Atleta atleta1 = new Atleta("Hugo","Andebol","185",80,"Portugal");
        Atleta atleta2 = new Atleta("Manuel","Andebol","170",65,"Espanha");
        Atleta atleta3 = new Atleta("Afonso","Futebol","165",60,"Suiça");
        Competicao competicao1 = new Competicao("4All","Portugal");

        // Atribuir atletas para competições
        competicao1.adicionarAtletas(atleta1);
        competicao1.adicionarAtletas(atleta2);
        competicao1.adicionarAtletas(atleta3);

        // Exibir Competição 1
        competicao1.exibirCompeticao();
    }
}
