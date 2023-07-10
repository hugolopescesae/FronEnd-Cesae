import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Ler num
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Apresentar número anteriores
        for (int i = 0;i < 5;i++){
            System.out.print((num++)-5+" ");
        }
        num++;
        for (int i = 0;i < 5;i++){
            System.out.print((num++)-5+" ");
        }
    }
}