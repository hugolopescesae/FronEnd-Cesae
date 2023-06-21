import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, max;

        // Ler número escolhido pelo utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        max = num;

        // Apresentar números desde o 0 até ao número escolhido
        for (num = 0;max>num;num++){
            if (num>0){
                System.out.println(num);
            }
        }
    }
}
