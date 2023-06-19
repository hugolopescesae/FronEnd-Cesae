import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 11 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double saldo, movimento;

        // Ler saldo do utilizador
        System.out.print("Introduza o saldo da conta bancária: ");
        saldo= input.nextDouble();
        System.out.print("Introduza o montante a creditar/debitar: ");
        movimento= input.nextDouble();

        // Calculo do movimento
        if (movimento>0){
            if ((movimento+saldo)>0){
                System.out.println("A transação é válida, sendo que o seu saldo ficou positivo: "+(movimento+saldo));
            }else{
                System.out.println("A transação não foi válida, pois o seu saldo ficou negativo: "+(movimento+saldo));
            }
        }else{
            if (movimento<0){
                if ((movimento+saldo)>0){
                    System.out.println("A transição é válida, sendo que o seu saldo ficou positivo: "+(movimento+saldo));
                }else{
                    System.out.println("A transação não foi válida, pois o seu saldo ficou negativo: "+(movimento+saldo));
                }
            }
        }
    }
}
