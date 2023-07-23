import java.util.Scanner;

public class ex_10 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar Array
        int[][] array = new int[4][3];

        // Ler array
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Printar array
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
