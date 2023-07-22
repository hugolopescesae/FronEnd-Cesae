import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][2];
        int media = 0, counter = 0;

        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
                media+=array[i][j];
                counter++;
            }
        }

        System.out.println("O valor da soma é: "+(media/counter));
    }
}
