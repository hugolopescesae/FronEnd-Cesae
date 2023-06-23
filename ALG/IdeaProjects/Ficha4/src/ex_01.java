import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1, num2;
        String continuar;

        // Ler números do utilizador
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza outro número: ");
        num2 = input.nextInt();
        System.out.print("Introduza qual operação aritmética pretende fazer: ");
        continuar = input.next();

        // Apresentar operações
        do {
            if (continuar.equals("+")){
                System.out.println("O valor da soma é "+(num1+num2));
            }else if (continuar.equals("-")){
                System.out.println("O valor da subtração é "+(num1-num2));
            }else if (continuar.equals("*")){
                System.out.println("O valor da multiplicação é "+(num1*num2));
            }else if (continuar.equals("/")){
                System.out.println("O valor da divisão é "+(num1/num2));
            }else {
                System.out.println("Introduza o símbolo correto da respetiva operação");
            }while (){

            }
        }
    }
}
