import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2;

        // Ler num1 e num2
        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.print("Introduza outro número: ");
        num2 = input.nextDouble();

        // Apresentar maior e depois o menor
        if (num1==num2){
            System.out.println("Os números são iguais");
        }else if (num1>num2){
            System.out.println("O número um é o maior: "+num1);
            System.out.println("O número dois é o menor: "+num2);
        }else{
            System.out.println("O número dois é o maior: "+num2);
            System.out.println("O número um é o menor: "+num1);
        }
    }
}
