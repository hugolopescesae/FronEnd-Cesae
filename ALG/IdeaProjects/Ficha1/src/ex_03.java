import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double comp, larg;

        // Ler comp e larg
        System.out.print("Introduza o valor do Comprimento do retângulo: ");
        comp= input.nextDouble();
        System.out.print("Introduza o valor da Largura do retângulo: ");
        larg= input.nextDouble();

        // Apresentar área e perímetro
        System.out.println("O resultado da Área é: "+(comp*larg));
        System.out.println("O resultado do Perímetro é: "+(comp+comp+larg+larg));

    }
}
