import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 08 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2, aux = 1;

        // Pedir números do utilizador
        System.out.print("Introduza o número 1: ");
        num1 = input.nextInt();
        System.out.print("Introduza o número 2: ");
        num2 = input.nextInt();

        // Apresentar o resultado elevado
        for (int i = 0;i < num2;i++){
            aux = aux * num1;
        }
        // Printar o resultado
        System.out.println("O número "+num1+" elevado ao número "+num2+" é: "+aux);
    }
}
