import java.util.Scanner;

public class ex_04_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04_02 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        String simbolo ="*";
        int limite = 4;

        // Apresentar padrão 4_3
        System.out.println("Padrão 4_3 : ");
        for (int num = 1;num<=5;num++){
            while (limite>=num){
                System.out.print(" ");
                limite--;
            }
            System.out.println(simbolo);
            simbolo=simbolo+"*"+"*";
            limite=4;
        }
    }
}
