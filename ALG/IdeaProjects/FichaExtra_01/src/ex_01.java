import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int idade;

        // Ler idade do utilizador
        System.out.print("Introduza a sua idade: ");
        idade = input.nextInt();

        // Verificar se é maior de 18 ou não
        if (idade != 0){
            if (idade >= 18){
                System.out.println("O utilizador é maior de idade!");
            }else{
                System.out.println("O utilizador é menor de idade!");
            }
        }else{
            System.out.println("Introduza uma idade válida!");
        }
    }
}
