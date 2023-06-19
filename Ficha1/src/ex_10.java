import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 10 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double diastrabalhomensal, codigousuario, salarioiliquido, salarioliquido, subsidioalimetacaototal, IRS, segurancasocial;

        // Declarar Constante
        final double vencibase = 40;
        final double subalim = 5;

        // Ler código de usuário
        System.out.print("Introduza o código de funcionário: ");
        codigousuario= input.nextDouble();

        // Ler número de dias de trabalho mensal
        System.out.print("Introduza a quantidade de dias de trabalho mensal: ");
        diastrabalhomensal= input.nextDouble();

        // Cálculo e Apresentação do valor ilíquido a receber fruto do vencimento e subsídio de alimentação (a.)
        salarioiliquido=(vencibase+subalim)*diastrabalhomensal;
        System.out.println("O valor do salário ilíquido é: "+salarioiliquido);

        // Cálculo do valor do subsídio de alimentação (b.)
        subsidioalimetacaototal=subalim*diastrabalhomensal;
        System.out.println("O valor total do subsídio de alimentação é: "+subsidioalimetacaototal);

        // Cálculo da retenção de IRS a entregar ao estado (c.)
        IRS=salarioiliquido*0.10;
        System.out.println("O valor da retenção de IRS a entregar ao estado é : "+IRS);

        // Cálculo do valor total a entregar à Segurança Social (d.)
        segurancasocial=salarioiliquido*0.3475;
        System.out.println("O valor total a entregar à Segurança Social é: "+segurancasocial);

        // Cálculo do valor líquido a receber pelo funcionário (e.)
        salarioliquido=salarioiliquido-(segurancasocial+IRS);
        System.out.println("O valor líquido a receber pelo funcionário é: "+salarioliquido);

    }
}
