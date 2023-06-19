import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 03 *****");

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
            if (salario>=15001 && salario<=20000){
                System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.30));
            }else{
                if (salario>=20001 && salario<=25000){
                    System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.35));
                }else{
                    if (salario>25000){
                        System.out.println("O valor de impostos a pagar sobre o seu salário é: "+(salario*0.40));
                    }
                }
            }
        }
    }
}
