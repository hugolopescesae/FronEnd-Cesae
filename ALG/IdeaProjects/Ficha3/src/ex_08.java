import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Apresentar números
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Apresentar números
        for (int i = 4;i <= num;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}