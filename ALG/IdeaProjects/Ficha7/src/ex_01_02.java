import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_01_02 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_01_02.txt");
        Scanner scanner = new Scanner(file);

        String linha;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            System.out.println(linha);
        }

        scanner.close();
    }
}
