package Parte1;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];
        int media = 0;

        // Apresentar a média dos números inseridos
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] = input.nextInt();
            media = media + num[i];
        }
        System.out.print(media/10);
    }
}
