import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex_02 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_02.txt");
        PrintWriter printWriter = new PrintWriter(file);

        String linha;

        linha = "Hello World Java!";
        printWriter.println(linha);

        printWriter.close();
    }
}
