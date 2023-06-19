import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 06 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2;

        // Ler num1 e num2 do utilizador
        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();
        System.out.print("Introduza outro número: ");
        num2 = input.nextDouble();

        // Apresentar primeiro o número maior e depois o número menor na consola
        if (num1==num2){
            System.out.println("Os números são iguais");
        }else{
            if (num1>num2){
                System.out.println("O número um é o maior: "+num1);
                System.out.println("O número dois é o menor: "+num2);
            }else{
                System.out.println("O número dois é o maior: "+num2);
                System.out.println("O número um é o menor: "+num1);
            }
        }
    }
}
