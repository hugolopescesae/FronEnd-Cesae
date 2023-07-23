import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar Array
        int[] array = new int[14];

        // Ler array
        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }

        // Printar array
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
