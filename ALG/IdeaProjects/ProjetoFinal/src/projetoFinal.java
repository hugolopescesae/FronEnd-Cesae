import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class projetoFinal {

    public static String[][] lerFicheiro() throws FileNotFoundException {
        // Ler ficheiro
        File file = new File("files/GameStart.csv");
        Scanner scanner = new Scanner(file);

        String linha;
        int counter = 0;

        // Contar quantidade de linhas
        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            counter++;
        }

        String[][] ficheiro = new String[counter][9];

        scanner = new Scanner(file);

        // Contar
        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(";");
            for (int i = 0;i < ficheiro.length;i++){
                for (int j = 0;j < ficheiro[0].length;j++){
                    ficheiro[i][j] = itensLinha[j];
                }
            }
        }

        scanner.close();

        return ficheiro;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[][] matriz = lerFicheiro();

        for (int i = 0;i < matriz.length;i++){
            System.out.print(Arrays.toString(matriz[i]) +"");
            System.out.println("");
        }

    }

}
