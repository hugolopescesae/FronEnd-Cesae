import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 08 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int ano;

        // Ler ano do utilizador
        System.out.print("Introduza um ano: ");
        ano = input.nextInt();

        // Verificar se esse ano é bissexto
        if (ano % 4 == 0){
            System.out.println("O ano introduzido é bissexto!");
        }else{
            System.out.println("O ano introduzido não é bissexto!");
        }
    }
}
