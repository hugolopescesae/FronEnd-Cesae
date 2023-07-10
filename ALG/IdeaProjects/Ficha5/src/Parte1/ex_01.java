package Parte1;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];

        // Pedir números
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] =input.nextInt();
        }

        // Printar por ordem de inserção
        for (int i = 0;i< num.length;i++){
            System.out.println("num["+i+"] é: "+num[i]);
        }
    }
}
