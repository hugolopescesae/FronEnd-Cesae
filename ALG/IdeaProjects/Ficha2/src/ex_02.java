import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double salario;

        // Ler salario
        System.out.print("Introduza o seu salário: ");
        salario = input.nextDouble();

        // Apresentar impostos
        if (salario<=15000){
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.20));
        }else{
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.30));
        }
    }
}
