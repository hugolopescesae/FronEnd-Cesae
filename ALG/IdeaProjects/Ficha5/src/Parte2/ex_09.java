package Parte2;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 09 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Matriz
        int[][] num = new int[5][5];
        int soma = 0;

        // Pedir números do utilizador e printar a soma dos números
        for (int i = 0;i < num.length;i++){
            for (int c = 0;c < num[0].length;c++){
                System.out.print("Linha "+(i)+",Coluna "+(c)+": ");
                num[i][c] = input.nextInt();
                soma = soma + num[i][c];
            }
        }
        System.out.println("O valor da soma dos números é: "+soma);
    }
}
