import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Apresentar menu
        do {
            do {
                System.out.print("---- Menu ----\n1 - Criar \n2 - Atualizar \n3 - Eliminar \n4 - Sair \nEscolha uma opção: ");
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
