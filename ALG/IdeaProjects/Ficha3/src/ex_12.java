import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, counter,var = 0, aux = 0;

        // Ler counter
        System.out.print("Quantos números quer inserir na sequência? ");
        counter = input.nextInt();

        // Ler num
        for (int i = 1;i <= counter;i++){
            System.out.print("Introduza o número "+i+" : ");
            num = input.nextInt();
            if (num <= aux){
                var +=1;
            }
            aux = num;
        }

        // Printar se é Crescente ou não
        if (var > 0){
            System.out.println("A sequência não é crescente!");
        }else{
            System.out.println("A sequência é crescente!");
        }
    }
}
