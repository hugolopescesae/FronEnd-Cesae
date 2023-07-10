import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1, num2, num3;

        // Ler num1, num2, num3
        System.out.print("Introduza o número 1: ");
        num1= input.nextDouble();
        System.out.print("Introduza o número 2: ");
        num2= input.nextDouble();
        System.out.print("Introduza o número 3: ");
        num3= input.nextDouble();

        // Apresentar os números de forma crescente
        if (num1<num2 && num2<num3){
            System.out.println("A ordem crescente será: "+num1+","+num2+","+num3);
        }else if (num1<num3 && num3<num2){
            System.out.println("A ordem crescente será: "+num1+","+num3+","+num2);
        }else if (num2<num1 && num1<num3){
            System.out.println("A ordem crescente será: "+num2+","+num1+","+num3);
        }else if (num2<num3 && num3<num1){
            System.out.println("A ordem crescente será: "+num2+","+num3+","+num1);
        }else if (num3<num1 && num1<num2){
            System.out.println("A ordem crescente será: "+num3+","+num1+","+num2);
        }else if (num3<num2 && num2<num1){
            System.out.println("A ordem crescente será: "+num3+","+num2+","+num1);
        }else{
            System.out.println("Existem números iguais!");
        }
    }
}
