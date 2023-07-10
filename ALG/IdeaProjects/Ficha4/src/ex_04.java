import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;
        boolean primo = true;

        // Pedir número ao utilizador
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        // Verificar se é primo
        if (num<=1){
            primo = false;
        }
        for (int i = 2;i < num;i++){
            if (num % i == 0){
                primo = false;
            }
        }
        // Printar resultado
        if (primo){
            System.out.println("O número é primo!");
        }else{
            System.out.println("O número não é primo!");
        }
    }
}
