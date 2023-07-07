import java.util.Scanner;

public class ex_08 {
    // A função verifica qual o maior número do array
    static int maiorNumero(int[] array){
        int maior = array[0];
        for (int i = 0;i < array.length;i++){
            if (maior < array[i]){
                maior = array[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        //Instanciar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int counter;

        // Ler counter do utilizador
        System.out.print("Introduza a quantidade números que quer inserir no array: ");
        counter = input.nextInt();
        int[] array = new int[counter];

        // Ler números para o array
        for (int i = 0;i < counter;i++){
            System.out.print("Introduza o número "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        System.out.println(maiorNumero(array));
    }
}
