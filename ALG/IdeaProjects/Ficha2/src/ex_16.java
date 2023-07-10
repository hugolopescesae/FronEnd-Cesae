import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int valor, notas;

        // Ler valor
        System.out.print("Introduza um valor em euros (apenas múltiplos de 5): ");
        valor = input.nextInt();

        // Calcular notas
        if (valor % 5 == 0){
            notas = valor/200;
            System.out.println("Notas de 200: "+notas);
            valor = valor % 200;

            notas = valor/100;
            System.out.println("Notas de 100: "+notas);
            valor = valor % 100;

            notas = valor/50;
            System.out.println("Notas de 50: "+notas);
            valor = valor % 50;

            notas = valor/20;
            System.out.println("Notas de 20: "+notas);
            valor = valor % 20;

            notas = valor/10;
            System.out.println("Notas de 10: "+notas);
            valor = valor % 10;

            notas = valor/5;
            System.out.println("Notas de 5: "+notas);
            valor = valor % 5;
        }else{
            System.out.println("O valor tem de ser múltiplo de 5!");
        }
    }
}
