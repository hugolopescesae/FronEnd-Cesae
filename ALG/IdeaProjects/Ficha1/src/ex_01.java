import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2;

        // Ler num1 e num2
        System.out.print("Introduza um número: ");
        num1= input.nextInt();
        System.out.print("Introduza um número: ");
        num2= input.nextInt();

        // Apresentar a soma do num1 e num2
        System.out.print("O resultado da soma é: "+(num1+num2));

    }
}
