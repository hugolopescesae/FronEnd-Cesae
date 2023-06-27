import java.util.Scanner;

public class ex_04_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04_02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Varíavel
        String simbolo = "*";

        // Apresentar padrão 4_2
        System.out.println("Padrão 4_2 : ");
        for (int num = 0;num<5;num++){
            System.out.println(simbolo);
            simbolo=simbolo+"*";
        }
    }
}
