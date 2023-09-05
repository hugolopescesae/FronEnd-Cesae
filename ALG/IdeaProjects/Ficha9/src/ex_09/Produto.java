package ex_09;

public class Produto {
    // Atributos
    private String nome;
    private int preco;
    private int stock;

    // Constructor
    public Produto(String nome, int preco, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;
    }

    // Método Vender
    public String vender(int quantidade){
        if (stock<quantidade){
            return "Venda não efetuada! Quebra de Stock!";
        }else{
            this.stock -= quantidade;
            return "Venda efetuada com sucesso!";
        }
    }

    // Método Compra
    public String compra(int quantidade){
        this.stock += quantidade;
        return "Compra efetuada com sucesso!";
    }

    // Getter Stock
    public int getStock() {
        return stock;
    }
}
