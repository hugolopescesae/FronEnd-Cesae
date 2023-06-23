import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 12 *****");

        Scanner input = new Scanner(System.in);

        // Declarar variável
        int num, aux = 0, aux2 = 0, var = 0, var1 = 0, var2 = 0;

        // Ler números do utilizador
        System.out.print("Quantos números quer inserir na sequência: ");
        num = input.nextInt();

        if (num>0){
            while (var<num){
                var2 = var1;
                System.out.print("Introduza um número: ");
                var1 = input.nextInt();
                var = var + 1;
                if (var1<var2){
                    aux = aux + 1;
                }
                if (var1 == var2){
                    aux2 = aux2 + 1;
                }
            }
        }else{
            System.out.println("Introduza um número positivo!");
        }
        // Printar sé é crescente ou não
        if (aux >= 1 || aux2 >= 1){
            System.out.println("A sequência não está crescente!");
        }else{
            System.out.println("A sequência é crescente!");
        }
    }
}
