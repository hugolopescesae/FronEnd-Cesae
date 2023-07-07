import java.util.Scanner;

public class ex_07 {

    static int[] preencherArray(int[] array){
        // Scanner
        Scanner input = new Scanner(System.in);

        // Ler números do utilizador
        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+i+" : ");
            array[i] = input.nextInt();
        }
        return array;
    }
    static void imprimirArray(int[] array){
        for (int i = 0;i < array.length;i++){
            System.out.print("[");
            for (int j = 0;i < array.length;i++){
                System.out.print(" "+array[j]+" ");
            }
            System.out.print("]");
        }
    }

    public static void main(String[] args) {
        // Instanciar Scanner
        Scanner input = new Scanner(System.in);

        // Ler counter do utilizador
        System.out.print("Quantos número quer introduzir: ");
        int counter = input.nextInt();
        int [] array = new int[counter];

        array = preencherArray(array);
        imprimirArray(array);
    }
}
