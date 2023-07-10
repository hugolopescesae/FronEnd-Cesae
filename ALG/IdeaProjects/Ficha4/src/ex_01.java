import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int  num1, num2;
        String operacao, opcao;

        // Apresentar escolhas (menu)
        do {
            System.out.print("Introduza um número: ");
            num1 = input.nextInt();
            System.out.print("Introduza outro número: ");
            num2 = input.nextInt();
            System.out.print("Qual operação pretende fazer (+,-,*,/): ");
            opcao = input.next();
            switch (opcao) {
                case "+" -> System.out.println("A soma dos números será: " + (num1 + num2));
                case "-" -> System.out.println("A subtração dos números será: " + (num1 - num2));
                case "*" -> System.out.println("A multiplicação dos números será: " + (num1 * num2));
                case "/" -> System.out.println("A divisão dos números será: " + (num1 / num2));
                default -> System.out.println("Introduza um simbolo de operação válido!");
            }
            System.out.println("Pretende fazer mais alguma operação?(s/n): ");
            operacao = input.next();
        } while (operacao.equals("s"));
    }
}
