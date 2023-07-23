import java.util.Arrays;
import java.util.Scanner;

public class ex_09 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Verificar tamanho do array
        System.out.print("Introduza o tamanho do array: ");
        int counter = scanner.nextInt();
        int[] array = new int[counter];

        for (int i = 0;i < array.length;i++){
            System.out.print("Array["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        // Sort e Printar array
        Arrays.sort(array);

        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
