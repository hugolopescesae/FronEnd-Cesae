import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double preco1, preco2, preco3;

        // Ler preço1, preço2 e preço3
        System.out.print("Introduza o preço do produto um: ");
        preco1=input.nextDouble();
        System.out.print("Introduza o preço do produto dois: ");
        preco2=input.nextDouble();
        System.out.print("Introduza o preço do produto três: ");
        preco3=input.nextDouble();

        // Apresentar o preço final da compra dos 3 produtos com 10% de desconto
        System.out.println("O preço final da compra dos 3 produtos com 10% de desconto é: "+((preco1+preco2+preco3)*0.90));

    }
}
