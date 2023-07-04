package Parte1;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];
        int menor;

        // Pedir número do utilizador
        for(int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] = input.nextInt();
        }
        menor=num[0];

        // Apresentar número menor
        for (int i = 0;i < num.length;i++){
            if (num[i]<menor){
                menor=num[i];
            }
        }
        System.out.println("O menor elemento é o: "+menor);
    }
}