import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 02 *****");

        Scanner input = new Scanner(System.in);

        // Apresentar números multiplos de 3 entre 1 e 255
        for (int num = 3;num<=255;num = num + 3){
            System.out.println(num);
        }
    }
}
