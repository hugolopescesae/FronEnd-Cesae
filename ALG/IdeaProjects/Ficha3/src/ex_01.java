import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num = 0;

        // Apresentar os números pares até o número 300
        while (num<=300){
            System.out.println(num);
            num = num +2;
        }
    }
}
