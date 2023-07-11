package Parte1;

import java.util.Scanner;

public class ex_06 {
    static double somatorio(int num){
        // Declarar Variável
        int soma = 0, digito;

        // Verificar somatório
        for (int i = 0;num != 0;i++){
            digito = num % 10;
            soma = soma + digito;
            num = num / 10;
        }
        return soma;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;
        double soma;

        // Ler num
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Printar somatório dos números
        soma = somatorio(num);
        System.out.print("O somatório do número "+num+" é: "+soma);
    }
}
