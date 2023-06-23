import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 11 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int valor1, valor2;

        // Ler números do utilizador
        System.out.print("Introduza um valor inicial: ");
        valor1 = input.nextInt();
        System.out.print("Introduza um valor final: ");
        valor2 = input.nextInt();

        valor1 = valor1 +5;
        // Apresentar múltiplos de 5
        if (valor2>valor1){
            while (valor1<valor2){
                System.out.println(valor1);
                valor1 = valor1 + 5;
            }
        }else{
            System.out.println("O valor inicial tem de ser maior do que valor final!");
        }
    }
}
