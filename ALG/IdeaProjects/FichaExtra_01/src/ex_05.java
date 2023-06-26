import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        String sorriso;

        // Ler sorriso do utilizador
        System.out.print("Introduza um sorriso (exemplo: :) ou :( ou :D): ");
        sorriso = input.next();

        // Verificar se o sorriso é feliz ou triste
        if (sorriso.equals(":)") || sorriso.equals(":D")){
            System.out.println("O sorriso é feliz!");
        }else if (sorriso.equals(":(") || sorriso.equals(":|")){
            System.out.println("O sorriso está triste!");
        }else{
            System.out.println("Introduza um caractér válido!");
        }
    }
}
