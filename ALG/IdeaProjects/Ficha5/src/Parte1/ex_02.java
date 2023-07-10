package Parte1;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Array e Variável
        int[] num = new int[10];
        int aux = 0;

        // Printar total do preço dos produtos
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o preço do produto "+(i+1)+": ");
            num[i] = input.nextInt();
            aux = aux + num[i];
        }
        System.out.print("A soma dos números é: "+aux);
    }
}
