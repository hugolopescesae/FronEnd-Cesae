import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double peso;

        // Ler peso do utilizador
        System.out.print("Introduza o seu peso em kg: ");
        peso = input.nextInt();

        // Apresentar peso na lua
        if (peso != 0){
            System.out.println("O seu peso na lua seria: "+(peso*0.16)+"kg");
        }else{
            System.out.println("Introduza um peso válido!");
        }
    }
}
