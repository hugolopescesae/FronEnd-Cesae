import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 07 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int valor1, valor2;

        // Ler Valor 1 (valor1)
        System.out.print("Introduza um número inteiro: ");
        valor1=input.nextInt();

        // Ler Valor 2 (valor2)
        System.out.print("Introduza um número inteiro: ");
        valor2=input.nextInt();

        // Permuta dos valores das variáveis
        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        // Apresentar o resultado da permuta de variável
        System.out.println("O resultado do valor 1 é: "+valor1);
        System.out.println("O resultado do valor 2 é: "+valor2);

    }
}
