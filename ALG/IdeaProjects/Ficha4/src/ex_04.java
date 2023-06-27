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
        if (num>0){
            if (num == 1 || num != 2 && num % 2 == 0){
                System.out.println("O número introduzido é não primo!");
            }else{
                if (num>=9){
                    if (num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 9 == 0 ){
                        System.out.println("O número introduzido é não primo!");
                    }else{
                        System.out.println("O número introduzido é primo!");
                    }
                }else{
                    if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0){
                        System.out.println("O número introduzido é não primo!");
                    }else{
                        System.out.println("O número introduzido é primo!");
                    }
                }
            }
        }else{
            System.out.println("Introduza um número maior que zero!");
        }
    }
}
