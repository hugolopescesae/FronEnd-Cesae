import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2;

        // Ler num1 e num2
        System.out.print("Introduza o número 1: ");
        num1 = input.nextInt();
        System.out.print("Introduza o número 2: ");
        num2 = input.nextInt();

        // Apresentar múltiplos entre num1 e num2
        if (num2 > num1){
            for (int i = num1+1;i < num2;i++){
                if (i % 5 == 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("O número 2 tem de ser maior do que o número 1!");
        }
    }
}