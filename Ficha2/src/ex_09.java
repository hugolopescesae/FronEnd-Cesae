import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 09 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2, num3;

        // Ler num1 e num2 do utilizador
        System.out.print("Introduza o número 1: ");
        num1= input.nextInt();
        System.out.print("Introduza o número 2: ");
        num2= input.nextInt();
        System.out.print("Introduza 2 número 3: ");
        num3= input.nextInt();

        // Apresentar o menor número inteiro lido
        if (num1<num2 && num1<num3){
            System.out.println("O número um é o menor!");
        }else{
            if (num2<num1 && num2<num3){
                System.out.println("O número dois é o menor!");
            }else{
                if (num3<num1 && num3<num2){
                    System.out.println("O número três é o menor!");
                }else{
                    if (num1==num2 && num2==num3){
                        System.out.println("Os números são todos iguais!");
                    }else{
                        if (num1==num2 || num2==num3 || num1==num3){
                            System.out.println("Existem dois número iguais!");
                        }
                    }
                }
            }
        }
    }
}
