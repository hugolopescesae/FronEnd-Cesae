package Parte1;

import java.util.Scanner;

public class ex_01 {

    static int numeroMaisPequeno(int num1, int num2, int num3){
        //Declarar Variável
        int menor=0;

        if (num1 > num2){
            menor = num2;
        }else{
            if (num2 > num3){
                menor = num3;
            }
        }
        if (num2 > num3){
            menor = num3;
        }else{
            if (num3 > num1){
                menor = num1;
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2, num3, menor;

        // Ler números
        System.out.print("Introduza o número 1: ");
        num1 = input.nextInt();
        System.out.print("Introduza o número 2: ");
        num2 = input.nextInt();
        System.out.print("Introduza o número 3: ");
        num3 = input.nextInt();
        if (num1 == num2 && num2 == num3){
            System.out.println("Os números são todos iguais!");
        }else{
            menor = numeroMaisPequeno(num1, num2, num3);
            System.out.println("Menor: "+menor);
        }
    }
}
