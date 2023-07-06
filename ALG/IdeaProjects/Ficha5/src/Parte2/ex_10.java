package Parte2;

import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 10 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Matriz
        int[][] num = new int[4][5];
        int uti, aux = 0;

        // Pedir números do utilizador
        for (int i = 0;i < num.length;i++){
            for (int c = 0;c < num[0].length;c++){
                System.out.print("Linha "+(i)+",Coluna "+(c)+": ");
                num[i][c] = input.nextInt();
            }
        }
        System.out.print("Qual número quer verificar quantas vezes existe na Matriz? :");
        uti = input.nextInt();
        for (int i = 0;i < num.length;i++){
            for (int c = 0;c < num[0].length;c++){
                if (uti == num[i][c]){
                    aux = aux + 1;
                }
            }
        }
        System.out.println("O número inserido existe "+aux+" na Matriz!");
    }
}
