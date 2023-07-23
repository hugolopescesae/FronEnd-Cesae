import java.util.Scanner;

public class ex_06 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Ler array e declarar array
        System.out.print("Introduza o tamanho do array: ");
        int counter = scanner.nextInt();
        int[] array = new int[counter];

        // Printar array
        for (int i = 0;i < array.length;i++){
            System.out.print("Array ["+i+"] : ");
            array[i] = scanner.nextInt();
        }
    }
}
