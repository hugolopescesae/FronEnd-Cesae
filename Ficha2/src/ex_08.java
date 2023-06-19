import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 08 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double nota1, nota2, nota3, mediaponderada;

        // Ler notas do utilizador
        System.out.print("Introduza o valor da nota 1 (0-20 valores): ");
        nota1= input.nextDouble();
        System.out.print("Introduza o valor da nota 2 (0-20 valores): ");
        nota2= input.nextDouble();
        System.out.print("Introduza o valor da nota 3 (0-20 valores): ");
        nota3= input.nextDouble();

        // Calcular a média final ponderada
        mediaponderada=(((nota1*0.25)+(nota2*0.35)+(nota3*0.40))/3);

        // Apresentar o valor da média ponderada
        if (mediaponderada>=9.5 && mediaponderada<=20){
            System.out.println("O utilizador foi aprovado!");
        }else{
            System.out.println("O utilizador não foi aprovado!");
        }
    }
}
