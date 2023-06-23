import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num = 531;

        // Apresentar os números pares até o número 300
        while (num<=750){
            System.out.println(num);
            num = num + 2;
        }
    }
}
