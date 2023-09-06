package ex_02;

public class Main {
    public static void main(String[] args) {
        // Instanciar Conta
        Conta conta1 = new Conta(1,1000,"Hugo");

        // Método pedir empréstimo
        System.out.println(conta1.pedirEmprestimo(800));
        conta1.exibirDetalhes();
    }
}
