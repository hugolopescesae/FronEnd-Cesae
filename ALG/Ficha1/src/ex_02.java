import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2, resultado;

        // Ler número 1 (num1)
        System.out.print("Introduza um número: ");
        num1= input.nextDouble();

        // Ler número 2 (num2)
        System.out.print("Introduza um número: ");
        num2= input.nextDouble();

        // Soma (num1+num2)
        resultado=num1+num2;
        System.out.println("O resultado da Soma é: "+resultado);

        // Subtração (num1-num2)
        resultado=num1-num2;
        System.out.println("O resultado da Subtração é: "+resultado);

        // Multiplicação (num1*num2)
        resultado=num1*num2;
        System.out.println("O resultado da Multiplicação é: "+resultado);

        // Divisão (num1/num2)
        resultado=num1/num2;
        System.out.println("O resultado da Divisão é: "+resultado);

    }
}
