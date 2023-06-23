import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 10 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int var = 0, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        while (var != -1){
            System.out.print("Introduza outro valor: ");
            var = input.nextInt();
            if (var>0 && var<=25){
                intervalo1 = intervalo1 + 1;
            }else if (var>25 && var<=50){
                intervalo2 = intervalo2 + 1;
            }else if (var>50 && var<=75){
                intervalo3 = intervalo3 + 1;
            }else if (var>75 && var<=100){
                intervalo4 = intervalo4 + 1;
            }
        }
        System.out.print("Existem no intervalo [0,25] "+intervalo1+" número/os, no intervalo [25,50] "+intervalo2+" número/os, no intervalo [50,75] "+intervalo3+" número/os, no intervalo [75,100] "+intervalo4+" número/os!");
    }
}
