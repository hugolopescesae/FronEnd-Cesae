import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2, num3;

        // Ler num1, num2 e num3
        System.out.print("Introduza o número 1: ");
        num1=input.nextDouble();
        System.out.print("Introduza o número 2: ");
        num2=input.nextDouble();
        System.out.print("Introduza o número 3: ");
        num3=input.nextDouble();

        // Apresentar média aritmética
        System.out.println("O resultado da média aritmética é: "+((num1+num2+num3)/3));

        // Apresentar resultado da média ponderada
        System.out.println("O resultado da média com ponderação de 20% é: "+((num1+num2+num3)/3)*0.20);
        System.out.println("O resultado da média com ponderação de 30% é: "+((num1+num2+num3)/3)*0.30);
        System.out.println("O resultado da média com ponderação de 50% é: "+((num1+num2+num3)/3)*0.50);

    }
}
