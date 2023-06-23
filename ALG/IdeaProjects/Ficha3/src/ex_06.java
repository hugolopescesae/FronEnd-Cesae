import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, var, var2;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        var = num + 5;
        var2 = var + 5;

        // Apresentar números anteriores e seguintes
        while (num<var){
            System.out.println(num);
            num = num + 1;
        }
        var=var+1;
        while (var<=var2){
            System.out.println(var);
            var = var + 1;
        }
    }
}
