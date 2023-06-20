import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2;

        // Ler num1 e num2 do utilizador
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();

        // Apresentar o maior número na consola
        if (num1==num2){
            System.out.println("Os números são iguais");
        }else{
            if (num1>num2){
                System.out.println("O maior número é o primeiro: "+num1);
            }else{
                System.out.println("O maior número é o segundo: "+num2);
            }
        }
    }
}
