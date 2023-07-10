import java.util.Scanner;

public class ex_01 {
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

        // Apresentar maior
        if (num1==num2){
            System.out.println("Os números são iguais");
        }else if (num1>num2) {
            System.out.println("O maior número maior é o primeiro: " + num1);
        }else{
            System.out.println("O maior número maior é o segundo: "+num2);
        }
    }
}
