import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double preco;

        // Ler preço do produto
        System.out.print("Introduza o preço do produto: ");
        preco = input.nextDouble();

        // Apresentar preço com 10% se o produto custar mais de 100 euros
        if (preco > 100){
            System.out.println("O preço do produto com 10% de desconto será: "+(preco*0.90));
        }else if (preco <= 100 && preco > 0){
            System.out.println("O preço do produto será o mesmo!");
        }else{
            System.out.println("Introduza um preço válido!");
        }
    }
}
