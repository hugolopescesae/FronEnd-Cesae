import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Apresentar os números pares até o número 300
        for (num = 350;num<=750;num++){
            if (num % 2 == 1){
                System.out.println(num);
                num = num +1;
            }
        }
    }
}
