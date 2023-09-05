package ex_07;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private String categoria;
    private int numeroDePaginas;
    private int ISBN;

    // Constructor
    public Livro(String titulo, String autor, String categoria, int numeroDePaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroDePaginas = numeroDePaginas;
        this.ISBN = ISBN;
    }

    // Método exibirDetalhes
    public void exibirDetalhes(){
        System.out.println("Detalhes do Livro");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Categoria: "+categoria);
        System.out.println("Numero da Pagina: "+numeroDePaginas);
        System.out.println("ISBN: "+ISBN);
    }
}
