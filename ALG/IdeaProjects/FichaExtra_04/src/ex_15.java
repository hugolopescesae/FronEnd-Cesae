import java.util.Scanner;

public class ex_15 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner =  new Scanner(System.in);

        // Verifica linhas e colunas
        System.out.print("Introduza o número de linhas para a matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Intoduza o número de colunas para a matriz: ");
        int colunas = scanner.nextInt();

        // Declarar Array
        int[][] array = new int[linhas][colunas];

        // Ler array
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j <array[0].length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Printar array
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }

        System.out.println("");

        // Printar array transposto
        for (int i = 0;i < array[0].length;i++){
            for (int j = 0;j < array.length;j++){
                System.out.print(array[j][i]+"\t");
            }
            System.out.println("");
        }
    }
}
