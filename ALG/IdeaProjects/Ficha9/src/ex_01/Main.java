package ex_01;

public class Main {
    public static void main(String[] args) {

        // Instanciar Pessoas
        Pessoa pessoa1 = new Pessoa("Vitor", 24, 1.7);
        Pessoa pessoa2 = new Pessoa("Ana", 29, 1.6);

        // Imprimir Detalhes da Pessoa1
        System.out.println("***** Detalhes da ex_01.Pessoa 1 *****");
        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Nome: "+pessoa1.getIdade());
        System.out.println("Nome: "+pessoa1.getAltura());

        System.out.println("--------------------------------");

        // Imprimir Detalhes da Pessoa2
        System.out.println("***** Detalhes da ex_01.Pessoa 2 *****");
        System.out.println("Nome: "+pessoa2.getNome());
        System.out.println("Nome: "+pessoa2.getIdade());
        System.out.println("Nome: "+pessoa2.getAltura());
    }
}