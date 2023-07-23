import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_09 {

    public static int contarPalavras() throws FileNotFoundException {
        File file = new File("files/exercicio_09.txt");
        Scanner scanner = new Scanner(file);

        String linha;
        int numPalavras = 0;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] dividirLinha = linha.split(" ");
            numPalavras += dividirLinha.length;
        }
        scanner.close();
        return numPalavras;
    }

    public static String[] lerFicheiro() throws FileNotFoundException {
        File file = new File("files/exercicio_09.txt");
        Scanner scanner = new Scanner(file);

        String linha;


        return array;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] array = lerFicheiro();
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }

}
