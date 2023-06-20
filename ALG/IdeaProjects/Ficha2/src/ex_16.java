import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 16 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int euros, resto, nota200 = 0 , nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0;

        // Ler valor em euros
        System.out.print("Introduza um valor em euros (apenas múltiplos de 5): ");
        euros= input.nextInt();

        // Calcular notas
        if (euros>=200){
            nota200 = euros/200;
            euros = euros - (nota200*200);
            System.out.println(+euros);
        }else if (nota200 % euros > 0){
            nota100 = euros/100;
            euros = euros - (nota100*100);
            System.out.println(+euros);
        }else if (euros % nota100 != 1){
            nota50 = euros/50;
            euros = euros - (nota20*50);
            System.out.println(+euros);
        }else if (euros % nota50 != 1){

        }


    }
}
