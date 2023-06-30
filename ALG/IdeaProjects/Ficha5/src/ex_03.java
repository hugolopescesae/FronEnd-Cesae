import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array e Variável
        int[] num = new int[10];
        int aux = 0, maior = 0;

        // Declarar Variável
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] = input.nextInt();
            if (num[i]>=(num[i]+1)){
                maior = num[i];
            }
        }
        System.out.print("O maior elemento é : "+maior);
    }
}
