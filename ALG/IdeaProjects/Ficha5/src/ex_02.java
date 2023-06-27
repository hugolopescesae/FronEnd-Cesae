import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];

        // Declarar Variável
        int i = 1, aux = 1, aux2 = 0;

        while (i<=10){
            System.out.print("Introduza o preço do produto "+(aux++)+" : ");
            num[0] = input.nextInt();
            num[0]++;
            aux2 = aux2 + num[0];
            i++;
        }
        System.out.println("O preço total dos produtos é: "+aux2+"€");
    }
}
