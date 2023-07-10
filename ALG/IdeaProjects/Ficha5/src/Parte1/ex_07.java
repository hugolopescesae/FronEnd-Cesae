package Parte1;

import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        // Scannner
        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];
        int aux = 0;
        int maior = 0;

        // Pedir números ao utilizador
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] = input.nextInt();
            if (num[i] % 2 == 0){
                aux = aux + 1;
            }
        }
        maior = num[0];

        if (aux == 0) {
            System.out.println("Não existem números pares!");
        }else{
            for (int i = 1;i < num.length;i++){
                if (num[i] % 2 == 0 && num[i] > maior){
                    maior=num[i];
                }
            }
            System.out.println("O maior número par é: "+maior);
        }
    }
}
