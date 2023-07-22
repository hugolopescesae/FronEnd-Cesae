import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduza o tamanho do array: ");
        int counter = scanner.nextInt();

        int[] array = new int[counter];
        int[] arrayFinal = new int[counter];
        int remover, j = 0;

        for (int i = 0;i < array.length;i++){
            System.out.print("Array["+i+"]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Introduza o número que pretende remover: ");
        remover = scanner.nextInt();

        for (int i = 0;i < array.length;i++){
            if (array[i] != remover){
                arrayFinal[j] = array[i];
                j++;
            }
        }

        for (int i = 0;i < arrayFinal.length;i++){
            if (arrayFinal[i] != 0){
                System.out.print(arrayFinal[i]+" ");
            }
        }
    }
}
