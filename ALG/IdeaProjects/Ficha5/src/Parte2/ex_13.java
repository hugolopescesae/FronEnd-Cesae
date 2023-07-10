package Parte2;

import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Matriz
        int [][] matriz = new int[4][4];
        int soma = 0;

        for (int i = 0;i < matriz.length;i++){
            for (int c = 0;c < matriz[0].length;c++){
                System.out.print("Linha "+(i)+",Coluna "+(c)+": ");
                matriz[i][c] = input.nextInt();
            }
        }
        for (int i = 0;i < matriz.length;i++){
            for (int c = 0;c < matriz[0].length;c++){
                soma = soma + matriz[i][c];
                i++;
            }
        }
        System.out.println(soma);
    }
}
