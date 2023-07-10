import java.util.Scanner;

public class ex_05 {

    /**
     * A função verifica se o número é perfeito!
     * @param num
     * @return
     */
    static boolean perfeito(int num){
        int aux = 0;
        for (int i = 1;i < num;i++){
            if (num % i == 0){
                aux = aux + i;
            }
            if (aux == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar se é perfeito
        System.out.println(perfeito(num));
    }
}

