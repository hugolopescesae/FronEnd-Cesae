import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double diastrabalho, empregado, chefe, administrador;
        int codigo;
        String cargo;

        // Ler dias e código
        System.out.print("Introduza o código de utilizador: ");
        codigo = input.nextInt();
        System.out.print("Introduza o número de dias de trabalho: ");
        diastrabalho = input.nextDouble();
        System.out.print("Introduza o seu cargo (empregado,chefe,administrador): ");
        cargo = input.next();

        // Calcular o valor íliquido a receber fruto do vencimento (a.)
        if (cargo.equals("empregado")){
            System.out.println("O valor íliquido a receber será: "+((diastrabalho*40)+(diastrabalho*5)));
        }else if (cargo.equals("chefe")){
            System.out.println("O valor íliquido a receber será: "+((diastrabalho*60)+(diastrabalho*7.5)));
        }else{
            System.out.println("O valor íliquido a receber será: "+((diastrabalho*80)+(diastrabalho*7.5)));
        }

        // Calcular o total do súbsidio de alimentação a receber (b.)
        if (cargo.equals("empregado")){
            System.out.println("O valor total a receber de subsídio de alimentação será: "+(diastrabalho*5));
        }else if (cargo.equals("chefe")){
            System.out.println("O valor total a receber de subsídio de alimentação será: "+(diastrabalho*7.5));
        }else{
            System.out.println("O valor total a receber de subsídio de alimentação será: "+(diastrabalho*7.5));
        }

        // Calcular o valor da retenção de IRS a entregar ao estado (c.)
        if (cargo.equals("empregado") && ((diastrabalho*5)+(diastrabalho*40)<=1000)){
            System.out.println("O calor da retenção de IRS a entregar ao estado será: "+((diastrabalho*5)+(diastrabalho*40))*0.10);
        }else if (cargo.equals("empregado") && ((diastrabalho*5)+(diastrabalho*40)>=1000)){
            System.out.println("O calor da retenção de IRS a entregar ao estado será: "+((diastrabalho*5)+(diastrabalho*40))*0.20);
        }else if (cargo.equals("chefe") && ((diastrabalho*7.5)+(diastrabalho*60)<=1000)){
            System.out.println("O calor da retenção de IRS a entregar ao estado será: "+((diastrabalho*7.5)+(diastrabalho*60))*0.10);
        }else if (cargo.equals("chefe") && ((diastrabalho*7.5)+(diastrabalho*60)>=1000)){
            System.out.println("O calor da retenção de IRS a entregar ao estado será: "+((diastrabalho*7.5)+(diastrabalho*60))*0.20);
        }else if (cargo.equals("administrador") && ((diastrabalho*7.5)+(diastrabalho*80)<=1000)){
            System.out.println("O calor da retenção de IRS a entregar ao estado será: "+((diastrabalho*7.5)+(diastrabalho*80))*0.10);
        }else{
            System.out.println("O calor da retenção de IRS a entregar ao estado será: "+((diastrabalho*7.5)+(diastrabalho*80))*0.20);
        }

        // Calcular o valor total a entregar a Segurança Social (d.)
        if (cargo.equals("administrador")){
            System.out.println("O valor total a entregar a Segurança Social será: "+((diastrabalho*7.5)+(diastrabalho*80))*0.30);
        }else if (cargo.equals("empregado")){
                System.out.println("O valor total a entregar a Segurança Social será: "+((diastrabalho*5)+(diastrabalho*40))*0.3475);
        }else{
            System.out.println("O valor total a entregar a Segurança Social será: "+((diastrabalho*7.5)+(diastrabalho*80))*0.3475);
        }

        // Calcular o valor liquido a receber pelo funcionário (e.)
        switch (cargo){
            case "empregado" :
                if (((diastrabalho*5)+(diastrabalho*40)<=1000)){
                    System.out.println("O valor liquido a receber será: "+((diastrabalho*5)+(diastrabalho*40))*0.6525);
                }else{
                    System.out.println("O valor liquido a receber será: "+((diastrabalho*5)+(diastrabalho*40))*0.5525);
                    break;
            }
            case "chefe" :
                if (((diastrabalho*7.5)+(diastrabalho*60)<=1000)){
                    System.out.println("O valor liquido a receber será: "+((diastrabalho*7.5)+(diastrabalho*60))*0.6525);
                }else{
                    System.out.println("O valor liquido a receber será: "+((diastrabalho*7.5)+(diastrabalho*60))*0.5525);
                    break;
            }
            case "administrador" :
                if (((diastrabalho*7.5)+(diastrabalho*80)<=1000)){
                    System.out.println("O valor liquido a receber será: "+((diastrabalho*7.5)+(diastrabalho*80))*0.60);
                }else{
                    System.out.println("O valor liquido a receber será: "+((diastrabalho*7.5)+(diastrabalho*80))*0.50);
                    break;
            }
        }
    }
}



