import java.util.Scanner;

public class ex_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o tamanho do array: ");
        int counter = scanner.nextInt();
        int[] array = new int[counter];

        for (int i = 0;i < array.length;i++){
            System.out.print("Array ["+i+"] : ");
            array[i] = scanner.nextInt();
        }
    }
}
