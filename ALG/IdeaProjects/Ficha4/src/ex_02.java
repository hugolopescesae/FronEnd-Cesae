import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Ler opção do utilizador

        // Apresentar o menu
        do {
            do {
                System.out.println("1 - Criar");
                System.out.println("2 - Atualizar");
                System.out.println("3 - Eliminar");
                System.out.println("4 - Sair");
            } while (num < 1 || num > 4);
            switch (num){
                case 1:System.out.println("Escolheu a opção criar!");
                break;
                case 2:System.out.println("Escolheu a opção Atualizar");
                break;
                case 3:System.out.println("Escolheu a opção Eliminar");
                break;
                default:System.out.
            }
        }
    }
}
