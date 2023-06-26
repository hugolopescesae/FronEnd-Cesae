import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 07 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num = 15, uti;

        // Apresentar tentativas para advinhar
        System.out.println("Tente advinhar o número escolhido pelo sistema: ");
        uti = input.nextInt();
        if (uti != 15){
            if (uti > num){
                System.out.println("O número está errado! | O número introduzido é maior do que o número escolhido pelo sistema! | Tentativas restantes: 1");
            }else{
                System.out.println("O número está errado! | O número introduzido é menor do que o número escolhido pelo sistema! | Tentativas restantes: 1");
            }
            System.out.print("Tente advinhar novamente qual é o número escolhido pelo sistema: ");
            uti = input.nextInt();
            if (uti != 15){
                if (uti > num) {
                    System.out.println("O número está errado! | O número introduzido é maior do que o número escolhido pelo sistema! | Esgotou as tentativas!");
                } else {
                    System.out.println("O número está errado! | O número introduzido é menor do que o número escolhido pelo sistema! | Esgotou as tentativas!");
                }
            }else{
                System.out.println("O número está certo! | O número introduzido pelo sistema foi o número 15!");
            }
        }else{
            System.out.println("O número está certo! | O número introduzido pelo sistema foi o número 15!");
        }
    }
}
