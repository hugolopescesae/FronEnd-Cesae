import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2;
        String operacao;

        // Ler num1 e num2 do utilizador
        System.out.print("Introduza um número: ");
        num1= input.nextDouble();
        System.out.print("Introduza outro número: ");
        num2= input.nextDouble();
        System.out.print("Introduza qual operação arimética pretende fazer utlizando os respetivos símbolos da operação: ");
        operacao= input.next();

        // Apresentar operação e resultado
        if (operacao.equals("+")){
            System.out.println("A operação escolhida foi a soma, sendo o seu resultado. "+(num1+num2));
        }else if (operacao.equals("-")){
            System.out.println("A operação escolhida foi a subtração, sendo o seu resultado. "+(num1-num2));
        }else if (operacao.equals("*")){
            System.out.println("A operação escolhida foi a multiplicação, sendo o seu resultado. "+(num1*num2));
        }else if (operacao.equals("/")){
            System.out.println("A operação escolhida foi a divisão, sendo o seu resultado. "+(num1/num2));
        }else{
            System.out.println("Introduza um símbolo válido!");
        }
    }
}
