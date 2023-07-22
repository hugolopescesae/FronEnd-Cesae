import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_07 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_07.txt");
        Scanner scanner = new Scanner(file);

        String linha;
        int palavras = 0, linhas = 0;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinhas = linha.split(" ");
            if (itensLinhas.length != 1){
                palavras += itensLinhas.length;
                linhas++;
            }
        }

        System.out.println("Linhas: "+linhas+" Palavras: "+palavras);

        scanner.close();
    }
}
