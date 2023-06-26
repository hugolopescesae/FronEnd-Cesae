import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 06 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        String cor;

        // Ler cor dos olhos do utilizador
        System.out.print("Introduza a cor dos seus olhos (letras minúsculas): ");
        cor = input.next();

        // Apresentar resultado
        if (cor.equals("verde") || cor.equals("azul") || cor.equals("castanho")){
            System.out.println("Pareces ser humano!");
        }else{
            System.out.println("Cuidado, podes ser um alien!");
        }
    }
}
