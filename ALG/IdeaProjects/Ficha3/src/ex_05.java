import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, soma;

        // Apresentar números inteiros de 1 a 100
        for (num = 0;num<=100;num++){
            System.out.println(num);
        }

        // Apresentar soma dos números
        for (soma = num + (num+1);soma<100;soma++){
            System.out.println(soma);
            soma = num + (num+1);
        }

    }
}
