import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num = 1, var = 0;

        // Apresentar números até 100
        while (num<=100){
            System.out.println(num);
            num = num + 1;
            var = var + num;
        }
        System.out.println(var);
    }
}
