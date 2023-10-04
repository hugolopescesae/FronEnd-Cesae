import Enums.FamiliaPlanta;

import java.util.ArrayList;

public class MeioAmbiente {
    // Atributos
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    // Método Construtor
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    // Function plantaBebe()
    public boolean plantaBebe(int indexPlanta) {
        Planta plantaAtual = (Planta) this.seres.get(indexPlanta);
        if (plantaAtual.getFamilia() == FamiliaPlanta.ARVORES && agua >= 1) {
            agua -= 1;
            return true;
        }else if (plantaAtual.getFamilia() == FamiliaPlanta.FLORES && agua >= 0.1) {
            agua -= 0.1;
            return true;
        }else if (plantaAtual.getFamilia() == FamiliaPlanta.ERVAS && agua >= 0.25) {
            agua -= 0.25;
            return true;
        }else{
            return false;
        }
    }

    
}
