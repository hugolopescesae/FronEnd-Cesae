import Enums.FamiliaPlanta;

public class Planta extends SerVivo{
    // Atributos
    private FamiliaPlanta Familia;
    private int GrauDeDefesa;

    // Método Construtor
    public Planta(String nome, String especie, String pais, int idade, FamiliaPlanta familia, int grauDeDefesa) {
        super(nome, especie, pais, idade);
        this.Familia = familia;
        this.GrauDeDefesa = grauDeDefesa;
    }

    // Getter FamiliaPlanta
    public FamiliaPlanta getFamilia() {
        return Familia;
    }
}
