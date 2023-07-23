import java.util.Scanner;

public class ex_13 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar Array e Variável
        int[][] array = new int[3][3];
        int maior = 0, menor = 0;

        // Ler array
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();

            }
        }

        // Verificar maior e menor
        menor = array[0][0];

        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[0].length;j++){
                if (array[i][j] > maior){
                    maior = array[i][j];
                }
                if (array[i][j] < menor){
                    menor = array[i][j];
                }
            }
        }

        // Printar maior e menor
        System.out.println("Maior número: "+maior);
        System.out.println("Menor número: "+menor);
    }
}
