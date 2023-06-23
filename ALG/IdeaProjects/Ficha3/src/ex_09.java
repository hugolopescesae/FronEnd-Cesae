import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 09 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, salto, var = 0;

        // Apresentar números de zero até limite
        System.out.print("Introduza um número: ");
        num = input.nextInt();
        System.out.print("Introduza o valor do incremento: ");
        salto = input.nextInt();
        if (num>0){
            while (var<num){
                System.out.println(var);
                var = var + salto;
            }
            System.out.println(var);
        }else{
            System.out.println("Introduza um número maior do que zero!");
        }
    }
}
