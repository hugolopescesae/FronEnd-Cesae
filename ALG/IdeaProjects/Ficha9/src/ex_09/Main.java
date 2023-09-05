package ex_09;

public class Main {
    public static void main(String[] args) {
        // Instanciar Produtos
        Produto produto1 = new Produto("Batatas",2,100);

        // Método Venda 2 unidades
        System.out.println(produto1.vender(2));
        System.out.println(produto1.getStock());

        // Método Compra 10 unidades
        System.out.println(produto1.compra(10));
        System.out.println(produto1.getStock());

        // Método Venda 35 unidades
        System.out.println(produto1.vender(35));
        System.out.println(produto1.getStock());
    }
}
