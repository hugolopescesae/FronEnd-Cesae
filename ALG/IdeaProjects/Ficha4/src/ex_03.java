import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2, aux = 1;

        // Ler num1 e num2
        System.out.print("Jogador 1, introduza um número de 0 a 100: ");
        num1 = input.nextInt();
        System.out.print("Jogador 2, tente advinhar o número inserido pelo jogador 1: ");
        num2 = input.nextInt();

        // Ler tentativas
        for (int i = 0;num1 != num2;i++){
            if (num2 > num1){
                System.out.print("O número inserido é maior, tente novamente: ");
                num2 = input.nextInt();
            }else{
                System.out.print("O número inserido é menor, tente novamente: ");
                num2 = input.nextInt();
            }
            aux++;
        }

        // Apresentar tentativas
        System.out.println("Acertou!!! \nO número inserido foi o "+num1+"!\nForam necessárias "+aux+" tentativas!");
    }
}
