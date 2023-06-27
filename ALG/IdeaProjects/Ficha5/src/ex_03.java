import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];

        // Declarar Variável
        int i = 1, aux = 1, aux2 = 0;

        while (i<=10){
            System.out.print("Introduza o preço do produto "+(aux++)+" : ");
            num[0] = input.nextInt();
            i++;
            num[0]++;
            aux2 = aux2 + num[0];
        }
        System.out.println(aux2+"€");
    }
}
