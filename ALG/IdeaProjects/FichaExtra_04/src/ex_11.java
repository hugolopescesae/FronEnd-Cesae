import java.util.Scanner;

public class ex_11 {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] resultado = new int[3][3];

        for (int i = 0;i < matriz1.length;i++){
            for (int j = 0;j < matriz1[0].length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0;i < matriz2.length;i++){
            for (int j = 0;j < matriz2[0].length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0;i < resultado.length;i++){
            for (int j = 0;j < resultado[0].length;j++){
                resultado[i][j] = matriz1[i][j]+matriz2[i][j];
                System.out.print(resultado[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
