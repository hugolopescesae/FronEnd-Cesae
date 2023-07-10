import java.util.Scanner;

public class ex_13 {

    static void desenhar(String carater, int linhas, int colunas){
        for (int i = 0;i < linhas;i++){
            for (int j = 0;j < colunas;j++){
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1){
                    System.out.print(carater);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        String carater;
        int linhas, colunas;

        // Ler argumentos
        System.out.print("Introduza o carater: ");
        carater = input.next();
        System.out.print("Introduza o linhas: ");
        linhas = input.nextInt();
        System.out.print("Introduza o colunas: ");
        colunas = input.nextInt();

        // Função
        desenhar(carater, linhas, colunas);
    }
}
