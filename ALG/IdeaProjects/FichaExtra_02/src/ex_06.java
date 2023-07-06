import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 06 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int maior = 0, menor = 0, num = 0;

        // Ler número do utilizador
        for (int i = 1;i != 0;i++){
            num = maior;
            System.out.print("Introduza o número "+i+": ");
            num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("O maior número inserido foi o : "+maior);
        System.out.println("O menor número inserido foi o : "+menor);
    }
}
