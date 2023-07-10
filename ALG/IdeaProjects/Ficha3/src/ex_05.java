import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int aux = 0;

        // Apresentar os números
        for (int i = 1;i <= 100;i++){
            System.out.println(i);
            aux += i;
        }

        // Apresentar somatório
        System.out.println("A soma dos números é: "+aux);
    }
}