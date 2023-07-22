import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex_08 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_08.txt");
        Scanner scanner = new Scanner(file);

        File file2 = new File("files/exercicio_08_(01).txt");
        PrintWriter printWriter = new PrintWriter(file2);

        String linha;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLista = linha.split(" ");
            for (int i = 0;i < itensLista.length;i++){
                if (itensLista[i].equals("de")){
                    printWriter.println(linha);
                    break;
                }
            }
        }

        scanner.close();
        printWriter.close();
    }
}
