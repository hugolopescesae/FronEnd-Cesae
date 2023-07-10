import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, counter = 1, aux = 1;

        // Ler num
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar o fatorial
        if (num > 0){
            while (counter <= num){
                aux *= counter;
                counter++;
            }
            System.out.println("O fatorial do número é: "+aux);
        }else{
            System.out.println("Introduza um número positivo!");
        }
    }
}
