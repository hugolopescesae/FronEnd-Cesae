import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 09 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, soma = 0, digito;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Apresentar a soma dos digitos desse número
        while (num != 0){
            digito = num % 10;
            soma = soma + digito;
            num = num / 10;
        }
        System.out.println("A soma de todos os digitos do número é: "+soma);
    }
}
