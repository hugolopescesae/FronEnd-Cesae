import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, aux = 0, counter = 0;

        // Ler num
        for (int i = 0; i != -1;i++){
            System.out.print("Introduza o número "+i+" : ");
            num = input.nextInt();
            if (num == -1){
                break;
            }else{
                aux = aux + num;
                counter = counter + 1;
            }
        }
        System.out.println("A média dos números introduzidos é: "+(aux/counter));
    }
}