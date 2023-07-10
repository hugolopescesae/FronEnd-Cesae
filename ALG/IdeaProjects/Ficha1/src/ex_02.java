import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2;

        // Ler num1 e num2
        System.out.print("Introduza um número: ");
        num1= input.nextDouble();
        System.out.print("Introduza um número: ");
        num2= input.nextDouble();

        // Apresentar resultado das operações
        System.out.println("O resultado da Soma é: "+(num1+num2));
        System.out.println("O resultado da Subtração é: "+(num1-num2));
        System.out.println("O resultado da Multiplicação é: "+(num1*num2));
        System.out.println("O resultado da Divisão é: "+(num1/num2));


    }
}
