import java.util.Scanner;

public class ex_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[12];

        for (int i = 0;i < array.length;i++) {
            System.out.print("Introduza o número "+(i+1)+ ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0;i < array.length;i++){
            for (int j = 1+i;j < array.length;j++){
                if (array[i] == array[j]){
                    System.out.print(array[i]+" ");
                }
            }
        }
    }
}
