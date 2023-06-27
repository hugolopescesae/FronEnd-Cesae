import java.util.Scanner;

public class ex_05_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05_01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int limite = 1;

        // Apresentar Padrão 5_1
        System.out.println("Padrão 5_1 : ");
        for (int num1=1;num1<=4;num1++){
            System.out.print(num1);
            System.out.print(" ");
            limite = num1;
            while (limite<=num1){
                System.out.print(num1);
                System.out.println(" ");
                limite++;
            }
        }
    }
}
