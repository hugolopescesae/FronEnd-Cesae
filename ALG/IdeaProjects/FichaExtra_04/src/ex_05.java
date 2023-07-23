import java.util.Scanner;

public class ex_05 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar Array
        int[] array = new int[12];

        // Ler array
        for (int i = 0;i < array.length;i++) {
            System.out.print("Introduza o número "+(i+1)+ ": ");
            array[i] = scanner.nextInt();
        }

        // Verificar valores duplicados
        for (int i = 0;i < array.length;i++){
            for (int j = 1+i;j < array.length;j++){
                if (array[i] == array[j]){
                    System.out.print(array[i]+" ");
                }
            }
        }
    }
}
