package ex_01;

public class aviao {
    // Atributos
    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double compFuselagem;
    private double evergaduraAsas;
    private double alturaCauda;
    private int numMotores;
    private double automomia;
    private double velocidadeMaxima;
    private double preco;

    // Constructor
    public aviao(int numSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double evergaduraAsas, double alturaCauda, int numMotores, double automomia, double velocidadeMaxima, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.evergaduraAsas = evergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.automomia = automomia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    // Getter preço
    public double getPreco() {
        return preco;
    }
}
