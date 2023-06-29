import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];
        int maior = 0;

        // Apresentar número maior
        for (int i = 0; i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num [i] = input.nextInt();
            if (num[i] > maior){
                maior = num[i];
            }
        }
        System.out.println(maior);
    }
}
