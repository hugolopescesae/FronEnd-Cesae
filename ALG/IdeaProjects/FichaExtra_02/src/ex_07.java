import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 07 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int positivo = 0, negativo = 0, num = 0;

        // Ler número do utilizador
        for (int i = 1;i != 0;i++){
            num = positivo;
            System.out.print("Introduza o número "+i+": ");
            num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num > 0){
                positivo = positivo + 1;
            }
            if (num < 0){
                negativo = negativo + 1;
            }
        }
        System.out.println("O quantidade de números positivos inseridos foi : "+positivo);
        System.out.println("O quantidade de números negativos inseridos foi : "+negativo);
    }
}
