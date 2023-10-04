public class Inseto extends SerVivo{
    // Atributos
    private boolean venenoso;

    // Método Construtor
    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }
}
