import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 06 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2, num3, media;

        // Ler número 1 (num1)
        System.out.print("Introduza o número 1: ");
        num1=input.nextDouble();

        // Ler número 2 (num2)
        System.out.print("Introduza o número 2: ");
        num2=input.nextDouble();

        // Ler número 3 (num3)
        System.out.print("Introduza o número 3: ");
        num3=input.nextDouble();

        // Calcular média aritmética
        media=(num1+num2+num3)/3;

        // Apresentar resultado da média aritmética
        System.out.println("O resultado da média aritmética é: "+media);

        // Apresentar resultado da média ponderada
        System.out.println("O resultado da média com ponderação de 20% é: "+(media*0.20));
        System.out.println("O resultado da média com ponderação de 30% é: "+(media*0.30));
        System.out.println("O resultado da média com ponderação de 50% é: "+(media*0.50));

    }
}
