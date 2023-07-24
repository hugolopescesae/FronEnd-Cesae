import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ex_09 {

    public static void main(String[] args) throws FileNotFoundException {
        // Ler ficheiro
        File file = new File("files/exercicio_09.txt");
        Scanner scanner = new Scanner(file);

        String palavra;
        int counter = 0,index = 0, aux = 0;

        // Contar tamanho do array
        while (scanner.hasNext()){
            palavra = scanner.next();
            counter++;
        }

        // Declarar Array
        String[] palavras = new String[counter];

        // Inserir palavras no array
        scanner = new Scanner(file);
        while (scanner.hasNext()){
            palavra = scanner.next();
            palavras[index] = palavra;
            index++;
        }

        // Criar matriz
        String[][] ficheiro = new String[counter][2];
        for (int i = 0;i < ficheiro.length;i++){
            for (int j = 0;j < ficheiro[0].length;j++){
                for (int k = 0;k < palavras.length;k++){
                    if (palavras[i].equals(palavras[k])){
                        aux++;
                    }
                }
                ficheiro[i][j] = Integer.toString(aux);
                aux = 0;
            }
            ficheiro[i][0] = palavras[i];
        }

        // Printar matriz
        for (int i = 0;i < ficheiro.length;i++){
            for (int j = 0;j < ficheiro[0].length;j++){
                System.out.print(ficheiro[i][j]+" ");
            }
            System.out.println("");
        }

        // Organizar matriz
        for (int i = 0;i < ficheiro.length;i++){
            Arrays.sort(ficheiro[1]);
        }

        // Printar matriz
        for (int i = 0;i < ficheiro.length;i++){
            for (int j = 0;j < ficheiro[0].length;j++){
                System.out.print(ficheiro[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
