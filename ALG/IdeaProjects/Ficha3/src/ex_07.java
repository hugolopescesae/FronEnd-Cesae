import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 07 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, var = 0, var2 = 0, var3 = 0, var4 = 0;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        var = num;

        while (var2 != -1){
            System.out.print("Introduza o número novamente: ");
            var2 = input.nextInt();
            var3 = var2 + var3;
            var4 = var4 + 1;
        }
        System.out.println("O valor da média é: "+(((var+var3)/var4)+1));
    }
}
