import java.util.Scanner;

public class ex_10 {

    // A função verifica se o array é crescente
    static boolean crescente(int[] array){
        int aux = 0;
        for (int i = 1;i < array.length;i++){
            if (array[i]<=array[i-1]){
                aux = aux + 1;
            }
        }
        if (aux > 0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {

        // Instanciar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int counter;

        // Ler números do utilizador
        System.out.print("Introduza quantos número quer inserir no array: ");
        counter = input.nextInt();
        int [] array = new int[counter];

        // Ler número para o array
        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        System.out.println(crescente(array));
    }
}
