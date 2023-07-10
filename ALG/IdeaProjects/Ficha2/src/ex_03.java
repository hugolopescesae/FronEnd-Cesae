import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double salario;

        // Ler salario
        System.out.print("Introduza o valor do seu salário: ");
        salario = input.nextDouble();

        // Apresentar impostos
        if (salario<14999){
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.20));
        }else if (salario<19999){
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.30));
        }else if (salario<24999){
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.35));
        }else {
            System.out.println("O valor de impostos a pagar sobre o seu salário é: " + (salario * 0.40));
        }
    }
}
