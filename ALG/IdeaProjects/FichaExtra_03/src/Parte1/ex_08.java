package Parte1;

import java.util.Scanner;

public class ex_08 {

    static boolean vogal(String vogal){
        vogal = vogal.toLowerCase();
        return vogal.equals("a") || vogal.equals("e") || vogal.equals("i") || vogal.equals("o") || vogal.equals("u");
    }

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        String letra;
        Boolean vogal;

        // Pedir letra
        System.out.print("Introduza uma letra: ");
        letra = input.next();

        // Verificar
        vogal = vogal(letra);
        System.out.print(vogal);
    }
}
