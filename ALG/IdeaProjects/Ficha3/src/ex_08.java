import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 08 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, var = 2;

        // Apresentar números
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        if (num>2){
            while (var<=num){
                System.out.println(var);
                var = var + 2;
            }
        }else{
            System.out.println("Introduza um número maior do que dois!");
        }
    }
}
