package Parte2;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Matriz
        int [][] num = new int[3][3];
        int maior, menor, soma = 0;

        // Pedir números ao utilizador
        for (int i = 0;i < num.length;i++){
            for (int c = 0;c < num[0].length;c++){
                System.out.print("Linha "+(i)+",Coluna "+(c)+": ");
                num[i][c] = input.nextInt();
                soma = soma + num[i][c];
            }
        }
        maior = num[0][0];
        menor = num[0][0];
        for (int i = 0;i < num.length;i++){
            for (int c = 0;c < num[0].length;c++){
                if (num[i][c]>maior){
                    maior=num[i][c];
                }
                if (num[i][c]<menor){
                    menor=num[i][c];
                }

            }
        }
        System.out.println("O maior número introduzido na matriz é o: "+maior);
        System.out.println("O menor número introduzido na matriz é o: "+menor);
        System.out.println("A soma do conjunto de números da matriz é: "+soma);
    }
}
