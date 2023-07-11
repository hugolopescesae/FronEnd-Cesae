package Parte1;

import java.util.Scanner;

public class ex_09 {

    static String mes(int numMes){
        String[] mes = new String[12];

        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";

        return mes[numMes-1];
    }

    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int numMes;
        String mes;

        // Ler mes
        System.out.print("Introduza o número correspondente ao mês: ");
        numMes = input.nextInt();

        // Verificar mês
        mes = mes(numMes);
        System.out.print(mes);
    }
}
