package Parte2;

import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Matriz
        int [] mesDiasTrabalho = new int[12];
        int [] mesValorIliquido = new int[12];
        int [] mesSubsidioAlimentacao = new int[12];
        int [] mesIRS = new int[12];
        int [] mesSegurancaSocial = new int[12];
        int [] mesValorLiquido = new int[12];
        int [] mesEncargoEmpresa = new int[12];

        // Declarar Variável
        int codigo, opcao;
        double salario;
        String nome, cargo, corrigir, sair;

        do {
            // Parte a.
            do { // Pedir Nome
                System.out.print("Qual é o seu nome: ");
                nome = input.nextLine();
                System.out.print("Pretende corrigir o nome inserido?(s/n): ");
                corrigir = input.nextLine();
            }while (corrigir.equals("s"));
            do { // Pedir Código
                System.out.print("Qual é o seu código de funcionário: ");
                codigo = input.nextInt();
                System.out.print("Pretende corrigir o código inserido?(s/n): ");
                corrigir = input.next();
            }while (corrigir.equals("s"));
            do { // Pedir Cargo
                System.out.print("Qual é o seu cargo: ");
                cargo = input.next();
                if (cargo.equals("empregado") || cargo.equals("chefe") || cargo.equals("administrador")){
                    System.out.print("Pretende corrigir o cargo inserido?(s/n): ");
                    corrigir = input.next();
                }else{
                    System.out.println("O cargo introduzido não é válido!");
                    corrigir = "s";
                }
            }while (corrigir.equals("s"));
            // Parte b.
            do { // Pedir dias de trabalho em cada mês
                for (int i = 0;i < mesDiasTrabalho.length;i++){
                    System.out.print("Introduza o número de dias de trabalho no mês "+(i+1)+" : ");
                    mesDiasTrabalho[i] = input.nextInt();
                    if (mesDiasTrabalho[i] < 0 || mesDiasTrabalho[i] > 31){
                        System.out.println("O número de dias introduzido é inválido!");
                        i = 12;
                    }
                }
                System.out.println("Pretende corrigir o número de dias de trabalho de algum mês?(s/n): ");
                corrigir = input.next();
            }while (corrigir.equals("s"));
            // Parte c.
            do { // Menu de Seleção
                do {
                    System.out.println("Qual das operações pretende fazer?");
                    System.out.println("1 - Valor ilíquido (Base + Bónus) a receber fruto do vencimento.");
                    System.out.println("2 - Total do Subsídio de alimentação.");
                    System.out.println("3 - Valor da retenção de IRS a entregar ao estado.");
                    System.out.println("4 - Valor total a entregar à Segurança Social (ambos os encargos).");
                    System.out.println("5 - Valor líquido a receber pelo funcionário.");
                    System.out.println("6 - Encargo total com Salários, Subsídios e impostos que a empresa terá.");
                    opcao = input.nextInt();
                    if (opcao < 1 || opcao > 6){
                        System.out.println("Número inválido!");
                    }
                } while (opcao < 1 || opcao > 6);
                switch (opcao) {
                    case 1: // 1 - Valor ilíquido (Base + Bónus) a receber fruto do vencimento.
                        for (int i = 0; i < mesValorIliquido.length; i++){
                            if (cargo.equals("empregado")){
                                salario = mesDiasTrabalho[i] * 40;
                                if (mesDiasTrabalho[i] > 20){
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario+(salario*0.05)));
                                }else if (mesDiasTrabalho[i] > 17){
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario+(salario*0.02)));
                                }else{
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario));
                                }
                            }else if (cargo.equals("chefe")){
                                salario = mesDiasTrabalho[i] * 60;
                                if (mesDiasTrabalho[i] > 20){
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario+(salario*0.05)));
                                }else if (mesDiasTrabalho[i] > 17){
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario+(salario*0.02)));
                                }else{
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario));
                                }
                            }else if (cargo.equals("administrador")){
                                salario = mesDiasTrabalho[i] * 80;
                                if (mesDiasTrabalho[i] > 20){
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario+(salario*0.05)));
                                }else if (mesDiasTrabalho[i] > 17){
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario+(salario*0.02)));
                                }else{
                                    System.out.println("O valor ilíquido do mês "+(i+1)+" será: "+(salario));
                                }
                            }
                        }
                        break;
                    case 2: // 2 - Total do Subsídio de alimentação.
                        for (int i = 0; i < mesSubsidioAlimentacao.length; i++){
                            if (cargo.equals("empregado")){
                                System.out.println("O valor do Subsídio de alimentação no mês "+(i+1)+" será: "+(mesDiasTrabalho[i]*5));
                            }else if (cargo.equals("chefe") || cargo.equals("administrador")){
                                System.out.println("O valor do Subsídio de alimentação no mês "+(i+1)+" será: "+(mesDiasTrabalho[i]*7.5));
                            }
                        }
                        break;
                    case 3: // 3 - Valor da retenção de IRS a entregar ao estado.
                        for (int i = 0; i < mesIRS.length; i++){
                            if (cargo.equals("empregado")){
                                salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5);
                                if (salario < 1000){
                                    System.out.println("O valor da retenção de IRS do mês "+(i + 1) + " será: " + (salario * 0.10));
                                }else if (salario < 2500){
                                    System.out.println("O valor da retenção de IRS do mês "+(i + 1) + " será: " + (salario * 0.20));
                                }else if (salario >= 2500){
                                    System.out.println("O valor da retenção de IRS do mês "+(i + 1) + " será: " + (salario * 0.30));
                                }
                            }else if (cargo.equals("chefe")){
                                salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5);
                                if (salario < 1000){
                                    System.out.println("O valor da retenção de IRS do mês " + (i + 1) + " será: " + (salario * 0.10));
                                }else if (salario < 2500){
                                    System.out.println("O valor da retenção de IRS do mês " + (i + 1) + " será: " + (salario * 0.20));
                                }else if (salario >= 2500){
                                    System.out.println("O valor da retenção de IRS do mês " + (i + 1) + " será: " + (salario * 0.30));
                                }
                            }else if (cargo.equals("administrador")) {
                                salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5);
                                if (salario < 1000) {
                                    System.out.println("O valor da retenção de IRS do mês " + (i + 1) + " será: " + (salario * 0.10));
                                } else if (salario < 2500) {
                                    System.out.println("O valor da retenção de IRS do mês " + (i + 1) + " será: " + (salario * 0.20));
                                } else if (salario >= 2500) {
                                    System.out.println("O valor da retenção de IRS do mês " + (i + 1) + " será: " + (salario * 0.30));
                                }
                            }
                        }
                        break;
                    case 4: // 4 - Valor total a entregar à Segurança Social (ambos os encargos).
                        for (int i = 0; i < mesSegurancaSocial.length; i++) {
                            if (cargo.equals("empregado")) {
                                salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5);
                                System.out.println("O valor total a entregar a Segurança Social no mês " + (i + 1) + " será: " + (salario * 0.6525));
                            } else if (cargo.equals("chefe")) {
                                salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5);
                                System.out.println("O valor total a entregar a Segurança Social no mês " + (i + 1) + " será: " + (salario * 0.6525));
                            } else if (cargo.equals("administrador")) {
                                salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5);
                                System.out.println("O valor total a entregar a Segurança Social no mês " + (i + 1) + " será: " + (salario * 0.70));
                            }
                        }
                        break;
                    case 5: // 5 - Valor líquido a receber pelo funcionário.
                        for (int i = 0; i < mesValorLiquido.length; i++) {
                            if (cargo.equals("empregado")) {
                                if (mesDiasTrabalho[i] > 20) {
                                    salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5) + ((mesDiasTrabalho[i] * 40) * 0.05);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.30)));
                                    }
                                } else if (mesDiasTrabalho[i] > 17) {
                                    salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5) + ((mesDiasTrabalho[i] * 40) * 0.03);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.30)));
                                    }
                                } else {
                                    salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.30)));
                                    }
                                }
                            } else if (cargo.equals("chefe")) {
                                if (mesDiasTrabalho[i] > 20) {
                                    salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 60) * 0.05);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.30)));
                                    }
                                } else if (mesDiasTrabalho[i] > 17) {
                                    salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 60) * 0.03);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.30)));
                                    }
                                } else {
                                    salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525) - (salario * 0.30)));
                                    }
                                }
                            } else if (cargo.equals("administrador")) {
                                if (mesDiasTrabalho[i] > 20) {
                                    salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 80) * 0.05);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.30)));
                                    }
                                } else if (mesDiasTrabalho[i] > 17) {
                                    salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 80) * 0.03);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.30)));
                                    }
                                } else {
                                    salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.10)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.20)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70) - (salario * 0.30)));
                                    }
                                }
                            }
                        }
                        break;
                    case 6: // 6 - Encargo total com Salários, Subsídios e impostos que a empresa terá.
                        for (int i = 0; i < mesEncargoEmpresa.length; i++) {
                            if (cargo.equals("empregado")) {
                                if (mesDiasTrabalho[i] > 20) {
                                    salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5) + ((mesDiasTrabalho[i] * 40) * 0.05);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }
                                } else if (mesDiasTrabalho[i] > 17) {
                                    salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5) + ((mesDiasTrabalho[i] * 40) * 0.03);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    } else if (salario < 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    } else if (salario >= 2500) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }
                                } else {
                                    salario = (mesDiasTrabalho[i] * 40) + (mesDiasTrabalho[i] * 5);
                                    if (salario < 1000) {
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }
                                }
                            }else if (cargo.equals("chefe")){
                                if (mesDiasTrabalho[i] > 20){
                                    salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 60) * 0.05);
                                    if (salario < 1000){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }
                                }else if (mesDiasTrabalho[i] > 17){
                                    salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 60) * 0.03);
                                    if (salario < 1000){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }
                                }else{
                                    salario = (mesDiasTrabalho[i] * 60) + (mesDiasTrabalho[i] * 7.5);
                                    if (salario < 1000){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.6525)));
                                    }
                                }
                            }else if (cargo.equals("administrador")){
                                if (mesDiasTrabalho[i] > 20){
                                    salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 80) * 0.05);
                                    if (salario < 1000){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }
                                }else if (mesDiasTrabalho[i] > 17){
                                    salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5) + ((mesDiasTrabalho[i] * 80) * 0.03);
                                    if (salario < 1000){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }
                                }else {
                                    salario = (mesDiasTrabalho[i] * 80) + (mesDiasTrabalho[i] * 7.5);
                                    if (salario < 1000){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }else if (salario < 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }else if (salario >= 2500){
                                        System.out.println("O valor líquido a receber no mês " + (i + 1) + " será: " + (salario - (salario * 0.70)));
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        System.out.println("Introduza um valor entre 1 e 6!");
                        break;
                }
                System.out.println("Pretende realizar mais algum cálculo?(s/n)");
                corrigir = input.next();
            }while (corrigir.equals("s"));
        }while (corrigir.equals("s"));

        // Parte d.

    }
}