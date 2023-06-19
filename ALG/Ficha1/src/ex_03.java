import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double comp, larg, area, perimetro;

        // Ler Comprimento (comp)
        System.out.print("Introduza o valor do Comprimento do retângulo: ");
        comp= input.nextDouble();

        // Ler Largura (larg)
        System.out.print("Introduza o valor da Largura do retângulo: ");
        larg= input.nextDouble();

        // Calcular a Área do retângulo
        area= comp*larg;

        // Calcular o Perímetro do retângulo
        perimetro= (comp+comp+larg+larg);

        // Apresentar resultados
        System.out.println("O resultado da Área é: "+area);
        System.out.println("O resultado do Perímetro é: "+perimetro);

    }
}
