import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 15 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        double num1,num2 ,num3;
        String ordem;

        // Ler números do utilizador
        System.out.print("Introduza um número: ");
        num1= input.nextDouble();
        System.out.print("Introduza outro número: ");
        num2= input.nextDouble();
        System.out.print("Introduza outro número: ");
        num3= input.nextDouble();
        System.out.print("Utilizando a letre C (crescente) ou D (decrescente), indique qual a forma como pretende organizar os números: ");
        ordem= input.next();

        // Apresentar número os número de forma crescente ou decrescente
        switch (ordem){
            case "C" : if (num1<num2 && num2<num3){
                System.out.println("A ordem crescente será: "+num1+","+num2+","+num3);
                break;
            }else{
                if (num1<num3 && num3<num2){
                    System.out.println("A ordem crescente será: "+num1+","+num3+","+num2);
                    break;
                }else{
                    if (num2<num1 && num1<num3){
                        System.out.println("A ordem crescente será: "+num2+","+num1+","+num3);
                        break;
                    }else{
                        if (num2<num3 && num3<num1){
                            System.out.println("A ordem crescente será: "+num2+","+num3+","+num1);
                            break;
                        }else{
                            if (num3<num1 && num1<num2){
                                System.out.println("A ordem crescente será: "+num3+","+num1+","+num2);
                                break;
                            }else{
                                if (num3<num2 && num2<num1){
                                    System.out.println("A ordem crescente será: "+num3+","+num2+","+num1);
                                    break;
                                }else{
                                    System.out.println("Existem números iguais!");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            case "D" : if (num1>num2 && num2>num3){
                System.out.println("A ordem decrescente será: "+num1+","+num2+","+num3);
                break;
            }else{
                if (num1>num3 && num3>num2){
                    System.out.println("A ordem decrescente será: "+num1+","+num3+","+num2);
                    break;
                }else{
                    if (num2>num1 && num1>num3){
                        System.out.println("A ordem decrescente será: "+num2+","+num1+","+num3);
                        break;
                    }else{
                        if (num2>num3 && num3>num1){
                            System.out.println("A ordem decrescente será: "+num2+","+num3+","+num1);
                            break;
                        }else{
                            if (num3>num1 && num1>num2){
                                System.out.println("A ordem decrescente será: "+num3+","+num1+","+num2);
                                break;
                            }else{
                                if (num3>num2 && num2>num1){
                                    System.out.println("A ordem decrescente será: "+num3+","+num2+","+num1);
                                    break;
                                }else{
                                    System.out.println("Existem números iguais!");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
