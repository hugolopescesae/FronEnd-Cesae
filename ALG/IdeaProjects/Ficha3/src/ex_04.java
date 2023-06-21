import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2;

        // Ler num1 e num2 do utilizador
        System.out.print("Introduza um número: ");
        num1= input.nextInt();
        System.out.print("Introduza outro número: ");
        num2= input.nextInt();

        // Apresentar números entre o num1 e num2
        if (num1>num2){
            while (num1>num2){
                System.out.println(num2);
                num2 = num2 + 1;
            }
        }else{
            while (num2>num1){
                System.out.println(num1);
                num1 = num1 + 1;
            }
        }
    }
}
