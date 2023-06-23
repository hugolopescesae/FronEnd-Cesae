import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 12 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, var = 1, var1 = 1, var2 = 0;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Calcular fatorial de um número
        if (num>0){
            while (var<=num){
                var1 = var1 * var;
                var = var + 1;
                var2 = var1;
            }
            System.out.println("O fatorial do número "+num+" é: "+var2);
        }else if (num == 0){
            System.out.println("O fatorial do número "+num+" é: 1");
        }else{
            System.out.print("Introduza um número positivo");
        }
    }
}
