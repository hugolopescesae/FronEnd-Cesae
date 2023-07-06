package Parte2;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 12 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Arrays e Matriz
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        int [][] matriz = new int[10][2];

        // Pedir números ao utilizador
        for (int i = 0;i < array1.length;i++){
            System.out.print("Array 1 : Introduza o número "+(i+1)+" : ");
            array1[i] = input.nextInt();
            matriz[i][0] = array1[i];
        }
        for (int i = 0;i < array2.length;i++){
            System.out.print("Array 2 : Introduza o número "+(i+1)+" : ");
            array2[i] = input.nextInt();
            matriz[i][1] = array2[i];
        }
        // Printar a Matriz
        for (int i = 0;i < matriz.length;i++){
            for (int c = 0;c < matriz[0].length;c++){
                System.out.print(matriz[i][c]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
