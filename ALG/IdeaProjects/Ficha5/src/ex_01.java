import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Array
        int[] num = new int[10];

        // Printar os números pela ordem de inserção
        for (int i = 0;i < num.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            num[i] =input.nextInt();
        }
        System.out.print("A ordem de inserção é: "+num[0]+","+num[1]+","+num[2]+","+num[3]+","+num[4]+","+num[5]+","+num[6]+","+num[7]+","+num[8]+","+num[9]);
    }
}
