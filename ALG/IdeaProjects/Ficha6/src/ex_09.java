import java.util.Scanner;

public class ex_09 {
    // A função verifica qual o menor número do array
    static int menorNumero(int[] array){
        int menor = array[0];
        for (int i = 0;i < array.length;i++){
            if (menor > array[i]){
                menor = array[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        // Instanciar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int counter;

        // Ler counter do utilizador
        System.out.print("Introduza a quantidade de números que quer inserir no array: ");
        counter = input.nextInt();
        int[] array = new int[counter];

        // Ler números para o array
        for (int i = 0;i < counter;i++){
            System.out.print("Introduza o número "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        System.out.println(menorNumero(array));
    }
}
