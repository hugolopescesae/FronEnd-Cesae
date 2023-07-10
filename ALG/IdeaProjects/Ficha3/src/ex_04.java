import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2;

        // Ler num1 e num2
        System.out.print("Introduza o número 1: ");
        num1= input.nextInt();
        System.out.print("Introduza o número 2: ");
        num2= input.nextInt();

        // Apresentar números entre num1 e num2
        if (num1 > num2){
            while (num1 >= num2){
                System.out.println(num2);
                num2 += 1;
            }
        }else if (num2 > num1){
            while (num2 >= num1){
                System.out.println(num1);
                num1 +=1;
            }
        }else{
            System.out.println("Introduza números diferentes!");
        }
    }
}