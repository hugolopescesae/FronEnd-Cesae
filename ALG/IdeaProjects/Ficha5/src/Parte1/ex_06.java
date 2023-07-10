package Parte1;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Array e Variavel
        int[] num = new int[10];
        int maior, aux = 0;

        // Pedir número ao utilizador
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] = input.nextInt();
        }
        maior=num[0];

        // Verificar se estão em ordem crescente
        for (int i = 1;i < num.length;i++){
            if (num[i] == maior || num[i] < maior){
                aux = aux + 1;
            }else{
                maior = num[i];
            }
        }
        if (aux == 0){
            System.out.println("Os elementos inseridos estão por ordem crescente!");
        }else{
            System.out.println("Os elementos não estão em ordem crescente!");
        }
    }
}
