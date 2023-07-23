import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar Array
        int[] array = new int[10];

        // Ler array
        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }

        // Printar por ordem inversa de inserção
        for (int i = 9;i >= 0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
