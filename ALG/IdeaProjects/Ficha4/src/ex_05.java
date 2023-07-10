import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int codigoFuncionario, numDias, aux;
        double salario, subali;
        String cargo, sair, corrigir;

        // Apresentar resultados
        do {
            do {
                System.out.print("Introduza o código de funcionário: ");
                codigoFuncionario = input.nextInt();
                System.out.print("Pretende corrigir o código de funcionário?(s/n) ");
                corrigir = input.next();
            }while (corrigir.equals("s"));
            do {
                System.out.print("Introduza o número de dias de trabalho: ");
                numDias = input.nextInt();
                if (numDias > 31 || numDias < 0) {
                    System.out.println("Número de dias inválido!");
                    System.out.print("Pretende corrigir os dias de trabalho?(s/n) ");
                    corrigir = input.next();
                }else{
                    System.out.print("Pretende corrigir os dias de trabalho?(s/n) ");
                    corrigir = input.next();
                }
            }while (corrigir.equals("s"));
            do {
                System.out.print("Introduza o seu cargo: ");
                cargo = input.next();
                if (cargo.equals("empregado") || cargo.equals("chefe") || cargo.equals("administrador")){
                    System.out.println("Pretende corrigir o seu cargo?(s/n)");
                    corrigir = input.next();
                }else{
                    System.out.println("Introduza um cargo válido (empregado,chefe,administrador)!");
                    System.out.println("Pretende corrigir o cargo inserido?(s/n)");
                    corrigir = input.next();
                }
            }while (corrigir.equals("s"));
            do {
                do {
                    System.out.println("Opções disponíveis: ");
                    System.out.println("1 - Valor íliquido (Base+Bónus) a receber fruto do vencimento!");
                    System.out.println("2 - Valor total do Subsídio de Alimentação!");
                    System.out.println("3 - Valor da retenção de IRS a entregar ao estado!");
                    System.out.println("4 - Valor total a entregar à Segurança Social(ambos os encargos)!");
                    System.out.println("5 - Valor líquido a receber!");
                    System.out.println("6 - Encargo total com salários, subsídios e impostos que a empresa terá!");
                    aux = input.nextInt();
                } while (aux < 0 || aux > 6);
                switch (aux) {
                    case 1: // Valor íliquido (Base+Bónus) a receber fruto do vencimento!
                        if (cargo.equals("empregado")){
                            salario = 40 * numDias;
                            if (numDias > 20){
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.05));
                            }else if (numDias > 17){
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.03));
                            }else{
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario));
                            }
                        }else if (cargo.equals("chefe")){
                            salario = 60 * numDias;
                            if (numDias > 20){
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.05));
                            }else if (numDias > 17){
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.03));
                            }else{
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario));
                            }
                        }else{
                            salario = 80 * numDias;
                            if (numDias > 20){
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.05));
                            }else if (numDias > 17){
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.03));
                            }else{
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario));
                            }
                        }
                        break;
                    case 2: // Valor total do Subsídio de Alimentação!
                        if (cargo.equals("empregado")){
                            System.out.println("O valor total do Subsídio de Alimentação será: "+(numDias*5));
                        }else{
                            System.out.println("O valor total do Subsídio de Alimentação será: "+(numDias*7.5));
                        }
                        break;
                    case 3: // valor da retenção de IRS a entregar ao estado
                        if (cargo.equals("empregado")){
                            salario = numDias * 40;
                            if (salario < 1000){
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.10));
                            }else if (salario < 2500){
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.20));
                            }else{
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.30));
                            }
                        }else if (cargo.equals("chefe")){
                            salario = numDias * 60;
                            if (salario < 1000){
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.10));
                            }else if (salario < 2500){
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.20));
                            }else{
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.30));
                            }
                        }else{
                            salario = numDias * 80;
                            if (salario < 1000){
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.10));
                            }else if (salario < 2500){
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.20));
                            }else{
                                System.out.println("O valor da retenção de IRS a entregar ao estado será: "+(salario*0.30));
                            }
                        }
                        break;
                    case 4: // Valor total a entregar à Segurança Social(ambos os encargos)
                        if (cargo.equals("empregado")){
                            salario = numDias * 40;
                            System.out.println("Valor total a entregar à Segurança Social(ambos os encargos) será: "+(salario*0.3475));
                        }else if (cargo.equals("chefe")){
                            salario = numDias * 60;
                            System.out.println("Valor total a entregar à Segurança Social(ambos os encargos) será: "+(salario*0.3475));
                        }else{
                            salario = numDias * 80;
                            System.out.println("Valor total a entregar à Segurança Social(ambos os encargos) será: "+(salario*0.30));
                        }
                        break;
                    case 5: // Valor líquido a receber!
                        if (cargo.equals("empregado")){
                            salario = 40 * numDias;
                            if (numDias > 20){
                                subali = numDias * 5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.05)+subali);
                            }else if (numDias > 17){
                                subali = numDias * 5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.03)+subali);
                            }else{
                                subali = numDias * 5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+subali);
                            }
                        }else if (cargo.equals("chefe")){
                            salario = 60 * numDias;
                            if (numDias > 20){
                                subali = numDias * 7.5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.05)+subali);
                            }else if (numDias > 17){
                                subali = numDias * 7.5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.03)+subali);
                            }else{
                                subali = numDias * 7.5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+subali);
                            }
                        }else{
                            salario = 80 * numDias;
                            if (numDias > 20){
                                subali = numDias * 7.5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.05)+subali);
                            }else if (numDias > 17){
                                subali = numDias * 7.5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+(salario*0.03)+subali);
                            }else{
                                subali = numDias * 7.5;
                                System.out.println("O valor íliquido a receber fruto do vencimento será: "+(salario)+subali);
                            }
                        }
                        break;
                    case 6: // Encargo total com salários, subsídios e impostos que a empresa terá!
                        if (cargo.equals("empregado")){
                            salario = 40 * numDias;
                            subali = 5 * numDias;
                            if (numDias > 20){
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.10)+(salario*0.2375)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.20)+(salario*0.2375)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.30)+(salario*0.2375)+subali);
                                }
                            }else if (numDias > 17){
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.10)+(salario*0.2375)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.20)+(salario*0.2375)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.30)+(salario*0.2375)+subali);
                                }
                            }else{
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.10)+(salario*0.2375)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.20)+(salario*0.2375)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.30)+(salario*0.2375)+subali);
                                }
                            }
                        }else if (cargo.equals("chefe")){
                            salario = 60 * numDias;
                            subali = 7.5 * numDias;
                            if (numDias > 20){
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.10)+(salario*0.2375)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.20)+(salario*0.2375)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.30)+(salario*0.2375)+subali);
                                }
                            }else if (numDias > 17){
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.10)+(salario*0.2375)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.20)+(salario*0.2375)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.30)+(salario*0.2375)+subali);
                                }
                            }else{
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.10)+(salario*0.2375)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.20)+(salario*0.2375)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.30)+(salario*0.2375)+subali);
                                }
                            }
                        }else{
                            salario = 80 * numDias;
                            subali = 7.5 * numDias;
                            if (numDias > 20){
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.10)+(salario*0.21)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.20)+(salario*0.21)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.05)+(salario*0.30)+(salario*0.21)+subali);
                                }
                            }else if (numDias > 17){
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.10)+(salario*0.21)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.20)+(salario*0.21)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.03)+(salario*0.30)+(salario*0.21)+subali);
                                }
                            }else{
                                if (salario < 1000){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.10)+(salario*0.21)+subali);
                                }else if (salario < 2500){
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.20)+(salario*0.21)+subali);
                                }else{
                                    System.out.println(" O encargo total com salários, subsídios e impostos que a empresa terá, será: "+salario+(salario*0.30)+(salario*0.21)+subali);
                                }
                            }
                        }
                    }
                    System.out.println("Pretende verificar mais algum vencimento?(s/n)"); // Verificar mais algum vencimento!
                    sair = input.next();
                }while (sair.equals("s"));
            System.out.println("Pretende corrigir algum dado inserido?(s/n)"); // Corrigir algum dado errado!
            corrigir = input.next();
        }while (corrigir.equals("s"));
    }
}

