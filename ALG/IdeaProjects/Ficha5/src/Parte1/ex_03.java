package Parte1;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Array e Variável
        int[] num = new int[10];
        int maior;

        // Pedir números ao utilizador
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] = input.nextInt();
        }
        maior=num[0];

        // Apresentar o maior elemento
        for (int i = 0;i < num.length;i++){
            if (num[i]>maior){
                maior=num[i];
            }
        }
        System.out.println("O maior elemento é o: "+maior);
    }
}
