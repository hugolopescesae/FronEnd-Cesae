import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Ler num
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Apresentar números
        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }
    }
}
