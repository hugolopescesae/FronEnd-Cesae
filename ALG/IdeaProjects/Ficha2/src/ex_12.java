import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        //Declarar Variável
        int opcao;

        // Ler opção
        System.out.println("Escolha uma das opções: \n1 - Criar \n2 - Atualizar \n3 - Eliminar \n4 - Sair ");
        opcao = input.nextInt();

        // Apresentar a esolha do utilizador
        switch (opcao){
            case 1: System.out.println("Opção 1 - Criar");
                break;
            case 2: System.out.println("Opção 2 - Atualizar");
                break;
            case 3: System.out.println("Opção 3 - Eliminar");
                break;
            case 4:
                break;
            default: System.out.println("O Número nãe é válido! Introduza o respetivo número da opção!");
                break;
        }
    }
}
