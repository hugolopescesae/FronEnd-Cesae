import java.util.Scanner;

public class ex_07 {

    static int[] preencherArray(int[] array){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Ler números do utilizador
        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        return array;
    }
    static void imprimirArray(int[] array){
        for (int i = 0;i < array.length;i++){
            System.out.print("[");
            for (int j = 0;i < array.length;i++){
                System.out.print(" "+array[i]+" ");
            }
            System.out.print("]");
        }
    }
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int counter;
        // Ler counter do utilizador
        System.out.print("Quantos número quer introduzir: ");
        counter = input.nextInt();
        int [] array = new int[counter];

        array = preencherArray(array);
        imprimirArray(array);
    }
}
