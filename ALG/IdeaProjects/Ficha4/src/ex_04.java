import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Pedir número ao utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar se é um número primo
        if (num != 2 && num != 1){
            if (num % 2 == 0) {
                System.out.println("O número introduzido ("+num+") é não primo!");
            }else{
                System.out.println("O número introduzido ("+num+") é primo!");
            }
        }else if (num == 1){
            System.out.println("O número introduzido ("+num+")é não primo primo!");
        }else{
            System.out.println("O número introduzido ("+num+")é primo!");
        }
    }
}
