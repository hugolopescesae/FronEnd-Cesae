package Parte1;

import java.util.Scanner;

public class ex_02 {

    static double media(double num1, double num2, double num3){
        // Declarar Variável
        double media;

        // Média
        media = (num1+num2+num3)/3;

        return media;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2, num3, media;

        // Pedir números
        System.out.print("Introduza o número 1: ");
        num1 = input.nextInt();
        System.out.print("Introduza o número 2: ");
        num2 = input.nextInt();
        System.out.print("Introduza o número 3: ");
        num3 = input.nextInt();

        // Printar média
        media = media(num1, num2,num3);
        System.out.println("Média: "+media);
    }
}
