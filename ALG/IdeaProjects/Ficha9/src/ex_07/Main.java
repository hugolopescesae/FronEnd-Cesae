package ex_07;

public class Main {
    public static void main(String[] args) {
        // Instanciar Livros
        Livro livro1 = new Livro("Livro 1","Autor 1","Categoria 1",100,1);
        Livro livro2 = new Livro("Livro 2","Autor 2","Categoria 2",100,2);

        livro1.exibirDetalhes();
    }
}
