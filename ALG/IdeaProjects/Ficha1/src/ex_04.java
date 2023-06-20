import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double raio, area;

        // Declarar Constante
        final double PI = 3.14159265;

        // Ler Raio da Circunferência (raio)
        System.out.print("Introduza o valor do raio da circunferência: ");
        raio= input.nextDouble();

        // Calcular a Área
        area=PI*(raio*raio);

        // Apresentar resultados
        System.out.println("O valor da Área é: "+area);

    }
}
