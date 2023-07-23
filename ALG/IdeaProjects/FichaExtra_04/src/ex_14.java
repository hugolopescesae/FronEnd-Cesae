import java.util.Scanner;

public class ex_14 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Declara Array e Variável
        int[][] array = new int[3][3];
        int maior = 0, menor = 0, segundoMaior = 0, segundoMenor = 0;

        // Ler array
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){
                System.out.print("Array["+i+"]["+j+"]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Verificar maior e menor

        menor = array[0][0];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){

                if (array[i][j] > maior){
                    maior = array[i][j];
                }
                if (array[i][j] < menor){
                    menor = array[i][j];
                }
            }
        }

        // Verificar segundoMaior e segundoMenor

        segundoMenor = array[0][1];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array.length;j++){
                if (array[i][j] > segundoMaior && array[i][j] != maior){
                    segundoMaior = array[i][j];
                }
                if (array[i][j] < segundoMenor && array[i][j] != menor){
                    segundoMenor = array[i][j];
                }
            }
        }

        // Printar resultados
        System.out.println("Maior Elemento : "+maior);
        System.out.println("Segundo Maior Elemento : "+segundoMaior);
        System.out.println("Menor Elemento : "+menor);
        System.out.println("Segundo menor Elemento : "+segundoMenor);
    }
}
