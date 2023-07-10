import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável e Constante
        double raio;
        final double PI = 3.14159265;

        // Ler raio
        System.out.print("Introduza o valor do raio da circunferência: ");
        raio= input.nextDouble();

        // Apresentar área
        System.out.println("O valor da Área é: "+(PI*(raio*raio)));

    }
}
