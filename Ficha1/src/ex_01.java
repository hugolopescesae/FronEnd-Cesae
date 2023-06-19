import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2, resultado;

        // Ler número 1 (num1)
        System.out.print("Introduza um número: ");
        num1= input.nextInt();

        // Ler número 2 (num2)
        System.out.print("Introduza um número: ");
        num2= input.nextInt();

        // Somar (num1+num2)
        resultado=num1+num2;

        // Apresentar o resultado da soma (num1+num2)
        System.out.print("O resultado da soma é: "+resultado);

    }
}
