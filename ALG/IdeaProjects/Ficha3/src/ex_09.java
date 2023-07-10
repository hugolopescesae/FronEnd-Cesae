import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int limite, salto;

        // Ler limite e salto
        System.out.print("Introduza um número: ");
        limite = input.nextInt();
        System.out.print("Introduza um incremento: ");
        salto = input.nextInt();

        // Printar números
        for (int i = 0;i <= limite;i+=salto){
            System.out.print(i+" ");
        }
    }
}