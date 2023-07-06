import java.util.Scanner;

public class ex_02 {

    /**
     * A função verifica se o número é par ou não
     * @param num
     * @return
     */
    static boolean numPar(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Pedir número ao utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar se o número é par
        System.out.println(numPar(num));
    }
}
