package Parte1;

import java.util.Scanner;

public class ex_05 {

    static String contarPiada(int piada){
        // Declarar Array
        String[] bibliotecaPiadas = new String[4];

        // Verificar se o número é menor que 4 e maior que 1
        if (piada < 1 || piada > 4){
            return "Número inválido!";
        }

        bibliotecaPiadas[0] ="Que nome se dá a uma ferramenta perdida? Foice.";
        bibliotecaPiadas[1] ="O que 17 alentejanos fazem em frente ao cinema? À espera que chegue mais um porque o filme é para mais de 18.";
        bibliotecaPiadas[2] ="Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] ="Que nome se dá a uma ferramenta perdida? O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";

        return bibliotecaPiadas[piada-1];
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int numPiada;

        System.out.print("Introduza um número parar ouvir a piada: ");
        numPiada = input.nextInt();

        System.out.println(contarPiada(numPiada));
    }
}
