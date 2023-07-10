package Parte1;

import java.util.Scanner;

public class ex_03 {

    static int calcularAreaRetangulo(int base, int altura){
        // Declarar Variável
        int area;

        // Calcular Área
        area = base * altura;

        return area;
    }

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int base, altura, area;

        // Pedir dados
        System.out.print("Introduza a base do retângulo: ");
        base = input.nextInt();
        System.out.print("Introduza a altura do retângulo: ");
        altura = input.nextInt();

        // Printar area
        area = calcularAreaRetangulo(base, altura);
        System.out.println("Área: "+area);

    }
}
