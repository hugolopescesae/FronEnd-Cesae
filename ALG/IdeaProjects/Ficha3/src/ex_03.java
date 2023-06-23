import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, min = 0;

        // Ler número escolhido pelo utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Apresentar números desde o 0 até ao número escolhido
        if (num<=0){
            while (num<=0){
                System.out.println(num);
                num = num + 1;
            }
        }else{
           while (min<=num){
               System.out.println(min);
               min = min + 1;
           }
        }
    }
}
