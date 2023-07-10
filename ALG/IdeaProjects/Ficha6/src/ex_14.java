import java.util.Scanner;

public class ex_14 {

    static void soma(int[][] matriz1, int[][] matriz2){
        int[][] resultado = new int[3][3];
        for (int i = 0;i < matriz1.length;i++){
            for (int j = 0;j < matriz1[0].length;j++){
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    static int imprimirSoma(int[][] matriz1, int[][] matriz2){
        int soma = 0;
        int[][] resultado = new int[3][3];
        for (int i = 0;i < matriz1.length;i++){
            for (int j = 0;j < matriz1[0].length;j++){
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                soma += resultado[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Ler números
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int somatorio;

        // Pedir números da matriz
        for (int i = 0;i < matriz1.length;i++){
            for (int j = 0;j < matriz1[0].length;j++){
                System.out.print("Matriz 1 | Linha "+i+" Coluna "+j+" : ");
                matriz1[i][j] = input.nextInt();
            }
        }
        for (int i = 0;i < matriz2.length;i++){
            for (int j = 0;j < matriz2[0].length;j++){
                System.out.print("Matriz 2 | Linha "+i+" Coluna "+j+" : ");
                matriz2[i][j] = input.nextInt();
            }
        }

        // Inicializar matriz

        soma(matriz1,matriz2);
        somatorio = (imprimirSoma(matriz1,matriz2));
        System.out.println("O valor do somatório é: "+somatorio);

    }
}
