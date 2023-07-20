import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_01_03 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_01_Alternativa02.txt");
        Scanner input = new Scanner(file);

        String linha;

        while (input.hasNextLine()){
            linha = input.nextLine();
            System.out.println(linha);
        }

        input.close();
    }
}
