import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04 *****");

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int lugar;

        // Ler lugar do piloto no final de cada corrida
        System.out.print("Introduza o lugar em que terminou a corrida: ");
        lugar = input.nextInt();

        // Apresentar lugar em que o piloto ficou no fim da corrida
        switch (lugar){
            case 1: System.out.println("O piloto ganhou 10 pontos");
                break;
            case 2: System.out.println("O piloto ganhou 8 pontos");
                break;
            case 3: System.out.println("O piloto ganhou 6 pontos");
                break;
            case 4: System.out.println("O piloto ganhou 5 pontos");
                break;
            case 5: System.out.println("O piloto ganhou 4 pontos");
                break;
            case 6: System.out.println("O piloto ganhou 3 pontos");
                break;
            case 7: System.out.println("O piloto ganhou 2 pontos");
                break;
            case 8: System.out.println("O piloto ganhou 1 pontos");
                break;
            default: System.out.println("A corrida só tem 8 lugares");
                break;
        }
    }
}
