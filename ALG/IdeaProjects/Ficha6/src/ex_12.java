import java.util.Scanner;

public class ex_12 {

    static int num(){

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num = 0;

        // Ler num
        for (int i = 0;num <= 0;i++){
            System.out.print("Introduza o número "+(i+1)+" : ");
            num = input.nextInt();
            if (num < 0){
                System.out.println("Número negativo! Introduza um número positivo!");
            }
        }
        return num;
    }

    static String imprimir(int num){
        String simbolo = "*";
        for (int i = 1;i < num;i++){
            simbolo = simbolo + "*";
        }
        return simbolo;
    }

    public static void main(String[] args) {
        System.out.println(imprimir(num()));
    }
}
