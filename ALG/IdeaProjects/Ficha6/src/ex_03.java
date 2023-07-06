import java.util.Scanner;

public class ex_03 {

    /**
     * A função verifica se os números são positivos ou não!
     * @param num
     * @return
     */
    static boolean positivo(int num){
        if (num >= 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Ler número do utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar se é positivo ou não
        System.out.println(positivo(num));
    }
}
