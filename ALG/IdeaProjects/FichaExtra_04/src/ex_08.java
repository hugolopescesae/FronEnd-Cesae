import java.util.Arrays;
import java.util.Scanner;

public class ex_08 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Verificar tamanho do array
        System.out.print("Introduza o tamanho do array: ");
        int counter = scanner.nextInt();
        int num, posicao, aux = 0;

        // Declarar Array
        int[] array = new int[counter];
        int[] arrayFinal = new int[counter+1];

        // Ler array
        for (int i = 0;i < array.length;i++){
            System.out.print("Array["+i+"] : ");
            array[i] = scanner.nextInt();
        }

        // Introduzir novo número, em que posição colocá-lo e Printar arrayFinal
        System.out.print("Introduza o número novo: ");
        num = scanner.nextInt();
        System.out.print("Introduza a posição do array em que o quer colocar: ");
        posicao = scanner.nextInt();

        for (int i = 0;i < array.length;i++){
            if (i == (posicao-1)){
                arrayFinal[i] = num;
                System.out.println(arrayFinal[i]+" ");
                for (int j = posicao;j < arrayFinal.length;j++){
                    arrayFinal[j] = array[i];
                    System.out.println(arrayFinal[j]+" ");
                    i++;
                }
                break;
            }
            arrayFinal[i] = array[i];
            System.out.println(arrayFinal[i]+" ");
        }
    }
}
