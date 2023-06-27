import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Apresentar menu
        do {
            do {
                System.out.println("Menu - Escolha uma das opções: ");
                System.out.println("1 - Criar");
                System.out.println("2 - Atualizar");
                System.out.println("3 - Eliminar");
                System.out.println("4 - Sair");
                num = input.nextInt();
            } while (num < 1 || num > 4);
            switch (num){
                case 1:System.out.println("Escolheu a primeira opção!");
                break;
                case 2:System.out.println("Escolheu a segunda opção!");
                break;
                case 3:System.out.println("Escolheu a terceira opção!");
                break;
                default:System.out.println("Escolheu a opção sair!");
            }
        } while (num != 4);
    }
}
