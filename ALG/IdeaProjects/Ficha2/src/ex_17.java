import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 17 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double saldomedio, credito;

        // Ler saldo médio do utilizador
        System.out.print("Introduza o valor do saldo médio referente ao último ano: ");
        saldomedio= input.nextDouble();

        // Calcular e Apresentar valor do crédito
        if (saldomedio>0 && saldomedio<= 2000){
            System.out.println("Será impossível fazer crédito perante o respetivo saldo médio ("+saldomedio+")");
        }else{
            if (saldomedio>2000 && saldomedio<=4000){
                System.out.println("O valor máximo de crédito perante o respetivo saldo médio("+saldomedio+"),será: "+(saldomedio*0.20));
            }else{
                if (saldomedio>4000 && saldomedio<=6000){
                    System.out.println("O valor máximo de crédito perante o respetivo saldo médio("+saldomedio+"),será: "+(saldomedio*0.30));
                }else{
                    if (saldomedio>=6000){
                        System.out.println("O valor máximo de crédito perante o respetivo saldo médio("+saldomedio+"),será: "+(saldomedio*0.40));
                    }else{
                        System.out.println("Introduza valores válidos!");
                    }
                }
            }
        }
    }
}
