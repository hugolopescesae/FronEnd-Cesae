package Parte1;

import java.util.Scanner;

public class ex_07 {

    static int inverterInteiro(int num){

        // Declarar Variável
        int invertido = 0, digito;

        // Inverter número
        for (int i = 0;num !=0;i++){
            digito = num % 10;
            invertido = (invertido * 10) + digito;
            num = num / 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, invertido;

        // Ler num
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Printar
        invertido = inverterInteiro(num);
        System.out.println("O número "+num+" ivertido será: "+invertido);
    }
}
