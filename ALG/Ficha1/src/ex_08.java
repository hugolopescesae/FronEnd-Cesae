import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 08 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double preco1, preco2, preco3;

        // Ler preço 1 (preco1)
        System.out.print("Introduza o preço do produto um: ");
        preco1=input.nextDouble();

        // Ler preço 2 (preco2)
        System.out.print("Introduza o preço do produto dois: ");
        preco2=input.nextDouble();

        // Ler preço 3 (preco3)
        System.out.print("Introduza o preço do produto três: ");
        preco3=input.nextDouble();

        // Apresentar o preço dos 3 produtos com 10% de desconto
        System.out.println("O preço do produto um com 10% de desconto é: "+(preco1*0.90));
        System.out.println("O preço do produto dois com 10% de desconto é: "+(preco2*0.90));
        System.out.println("O preço do produto três com 10% de desconto é: "+(preco3*0.90));

        // Apresentar o preço final da compra dos 3 produtos com 10% de desconto
        System.out.println("O preço final da compra dos 3 produtos com 10% de desconto é: "+((preco1+preco2+preco3)*0.90));


    }
}
