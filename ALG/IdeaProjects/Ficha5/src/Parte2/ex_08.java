package Parte2;

import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 08 *****");

        Scanner input = new Scanner(System.in);

        // Declara Matriz
        int[][] num = new int[3][3];

        // Pedir números ao utilizador
        for (int i = 0;i < num.length;i++){
            for (int c = 0;c < num[0].length;c++){
                System.out.print("Linha "+(i)+", Coluna "+(c)+": ");
                num[i][c] = input.nextInt();
            }
        }
        System.out.println("-----------------");
        for (int i = 0;i < num.length;i++) {
            for (int c = 0; c < num[0].length; c++) {
                System.out.print(num[i][c]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
