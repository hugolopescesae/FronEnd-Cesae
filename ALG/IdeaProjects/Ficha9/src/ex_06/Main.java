package ex_06;

public class Main {
    public static void main(String[] args) {

        // Instanciar objeto
        Calculadora operacao = new Calculadora();

        // Apresentar operações
        System.out.println(operacao.adicao(500,200));
        System.out.println(operacao.subtracao(32,200));
        System.out.println(operacao.multiplicacao(400,200));
        System.out.println(operacao.divisao(5210,200));
    }
}
