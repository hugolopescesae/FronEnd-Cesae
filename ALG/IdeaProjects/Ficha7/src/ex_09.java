import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_09 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_09.txt");
        Scanner scanner = new Scanner(file);

        String linha;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split("");
            for (int i = 0;i < itensLinha.length;i++){

            }
        }
    }
}
