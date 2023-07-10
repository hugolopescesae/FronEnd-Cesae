import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int valor1, valor2;

        // Ler valor1 e valor2
        System.out.print("Introduza um número inteiro: ");
        valor1=input.nextInt();
        System.out.print("Introduza um número inteiro: ");
        valor2=input.nextInt();

        // Permutar valor1 e valor 2
        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        // Apresentar novos valores
        System.out.println("O resultado do valor 1 é: "+valor1);
        System.out.println("O resultado do valor 2 é: "+valor2);

    }
}
