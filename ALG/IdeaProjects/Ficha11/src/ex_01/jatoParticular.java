package ex_01;

import java.util.ArrayList;

public class jatoParticular extends aviao{
    // Atributos
    private int lotacao;
    private int capacidadeBagagem;
    private categoria tipoCategoria;
    private ArrayList<Instalacoes> instalacoes;

    // Constructor
    public jatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double evergaduraAsas, double alturaCauda, int numMotores, double automomia, double velocidadeMaxima, double preco, int lotacao, int capacidadeBagagem, categoria tipoCategoria, ArrayList<String> instalacoes) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, evergaduraAsas, alturaCauda, numMotores, automomia, velocidadeMaxima, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.tipoCategoria = tipoCategoria;
        this.instalacoes = new ArrayList<Instalacoes>();
    }

    // Insert
    public void insertInstalacoes(Instalacoes insert){
        instalacoes.add(insert);
    }

    // Remove
    public void removeInstalacoes(Instalacoes remove){
        instalacoes.remove(remove);
    }

    // Print
    public void printInstalacoes(){
        for (int i = 0;i < instalacoes.size();i++){
            System.out.println(instalacoes.get(i));
        }
    }
}
