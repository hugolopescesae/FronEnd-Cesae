import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double salario;

        // Ler valor do salário do utilizar
        System.out.print("Introduza o valor do seu salário: ");
        salario = input.nextDouble();

        // Apresentar montante a pagar de impostos
        if (salario<=15000){
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.20));
        }else{
            System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.30));
        }
    }
}
