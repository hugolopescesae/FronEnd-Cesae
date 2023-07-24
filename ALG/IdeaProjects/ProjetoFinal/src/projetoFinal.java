import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class projetoFinal {
    public static String[][] lerFicheiro() throws FileNotFoundException {
        // Ler ficheiro
        File file = new File("files/GameStart.csv");
        Scanner scanner = new Scanner(file);

        // Declarar Variável
        int numLinhas = 0, numColunas = 0, aux = 0;
        String linha;

        // Descobrir o numLinhas e numColunas
        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            numLinhas++;
            numColunas = linha.split(";").length;
        }
        scanner.close();

        // Preencher array
        scanner = new Scanner(file);
        String[][] ficheiro = new String[numLinhas][numColunas];

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinhas = linha.split(";");
            for (int i = 0;i < itensLinhas.length;i++){
                    ficheiro[aux][i] = itensLinhas[i];
            }
            aux++;
        }
        scanner.close();

        return ficheiro;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[][] matriz = lerFicheiro();

        for (int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
