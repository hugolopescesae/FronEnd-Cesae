import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];

        // Ler números do utilizador
        System.out.print("Introduza o número 1: ");
        num[0] = input.nextInt();
        System.out.print("Introduza o número 2: ");
        num[1] = input.nextInt();
        System.out.print("Introduza o número 3: ");
        num[2] = input.nextInt();
        System.out.print("Introduza o número 4: ");
        num[3] = input.nextInt();
        System.out.print("Introduza o número 5: ");
        num[4] = input.nextInt();
        System.out.print("Introduza o número 6: ");
        num[5] = input.nextInt();
        System.out.print("Introduza o número 7: ");
        num[6] = input.nextInt();
        System.out.print("Introduza o número 8: ");
        num[7] = input.nextInt();
        System.out.print("Introduza o número 9: ");
        num[8] = input.nextInt();
        System.out.print("Introduza o número 10: ");
        num[9] = input.nextInt();

        // Apresentar num
        System.out.println("A ordem de inserção dos números é: ["+num[0]+","+num[1]+","+num[2]+","+num[3]+","+num[4]+","+num[5]+","+num[6]+","+num[7]+","+num[8]+","+num[9]+"]");
    }
}
