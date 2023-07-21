import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex_03 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_03.txt");
        Scanner scanner = new Scanner(file);
        File file2 = new File("files/exercicio_03_(01).txt");
        PrintWriter printWriter = new PrintWriter(file2);

        String linha;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            printWriter.println(linha);
        }

        scanner.close();
        printWriter.close();
    }
}
