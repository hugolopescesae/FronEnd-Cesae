import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2, aux = 1;

        // Ler número do jogador 1
        System.out.print("Jogador 1, introduza um número de 0 a 100: ");
        num1 = input.nextInt();


        // Ler tentativas do jogador 2
        if (num1 > 0 && num1 < 100){
            System.out.println("Jogador 2, tente advinhar o número escolhido pelo jogador 1:");
            num2 = input.nextInt();
            do {
                if (num2>num1){
                    System.out.println("Número errado! O número escolhido é maior do que o número escolhido pelo jogador 1, tente novamente: ");
                    num2 = input.nextInt();
                    aux = aux + 1;
                }else{
                    System.out.println("Número errado! O número escolhido é menor do que o número escolhido pelo jogador 1, tente novamente: ");
                    num2 = input.nextInt();
                    aux = aux + 1;
                }
            }while (num2 != num1);
            System.out.println("O número está correto!! Número de tentativas :"+aux);
        }else{
            System.out.println("Número inválido, introduza um valor entre 0 e 100!");
        }
    }
}
