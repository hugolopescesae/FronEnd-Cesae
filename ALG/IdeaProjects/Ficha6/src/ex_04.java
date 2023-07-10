import java.util.Scanner;

public class ex_04 {

    /**
     * A função verifica se o número é primo ou não!
     * @param num
     * @return
     */
    static boolean primo(int num){
        if (num <=1) {
            return false;
        }
        for (int i = 2;i < num;i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar se é primo
        System.out.println(primo(num));
    }
}