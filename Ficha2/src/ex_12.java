import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 12 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        //Declarar Variável
        int opcao;

        // Ler opção do utilizador
        System.out.print("Introduza entre as seguintes opções (Opção 1. Criar, Opção 2. Atualizar, Opção 3. Eliminar, Opção 4. Sair), o número da ação que pretende fazer:");
        opcao= input.nextInt();

        // Apresentar a esolha do utilizador
        switch (opcao){
            case 1: System.out.println("Opção 1. Criar");
            break;
            case 2: System.out.println("Opção 2. Atualizar");
            break;
            case 3: System.out.println("Opção 3. Eliminar");
            break;
            default: System.out.println("O Número nãe é válido! Introduza o respetivo número da opção!");
        }
    }
}
