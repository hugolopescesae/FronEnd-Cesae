package ex_01;

import java.util.ArrayList;

public class aviaoCombate extends aviao{
    // Atributos
    private String paisOrigem;
    private boolean hasCamulagem;
    private ArrayList<Armas> armas;

    // Constructor
    public aviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double evergaduraAsas, double alturaCauda, int numMotores, double automomia, double velocidadeMaxima, double preco, String paisOrigem, boolean hasCamulagem, ArrayList<String> armas) {
        super(numSerie, modelo, anoFabrico, peso, compFuselagem, evergaduraAsas, alturaCauda, numMotores, automomia, velocidadeMaxima, preco);
        this.paisOrigem = paisOrigem;
        this.hasCamulagem = hasCamulagem;
        this.armas = new ArrayList<Armas>();
    }

    // Insert
    public void insertArmas(Armas insert){
        armas.add(insert);
    }

    // Remove
    public void removeArmas(Armas remove){
        armas.remove(remove);
    }

    // Print
    public void printArmas(){
        for (int i = 0;i < armas.size();i++){
            System.out.println(armas.get(i));
        }
    }
}
