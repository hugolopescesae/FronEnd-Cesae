package Parte1;

import java.util.Scanner;

public class ex_04 {

    static void imprimirTabuada(int num){
        // Declarar Variável
        int tabuada;
        for (int i = 0;i < 10;i++){
            tabuada = num + i;
            System.out.println(num+" x "+i+" : "+tabuada);
        }
    }

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, tabuada;

        // Pedir num
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Printar tabudada
        tabuada = imprimirTabuada(num);
        System.out.println("Tabuada do "+num+" : ");
    }
}
