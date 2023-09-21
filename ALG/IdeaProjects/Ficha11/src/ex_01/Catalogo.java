package ex_01;

import java.util.ArrayList;

public class Catalogo {
    // Atributos
    private ArrayList<aviao> avioes;

    // Constructor
    public Catalogo(ArrayList<aviao> avioes) {
        this.avioes = new ArrayList<aviao>();
    }

    // Insert aviao
    public void insertAviao(aviao aviao){
        avioes.add(aviao);
    }

    // Remove aviao
    public void removeAviao(aviao aviao){
        avioes.remove(aviao);
    }

    // Cacular preço aviões
    public void calcularPrecoAvioes(){
        for (int i = 0;i <avioes.size();i++){
            avioes.get(aviao.get)
        }
    }
}
