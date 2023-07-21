import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_06 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_06.txt");
        Scanner scanner = new Scanner(file);

        String linha, nome = "";
        int max = 0;

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");
            if (Integer.parseInt(itensLinha[1]) > max){
                max = Integer.parseInt(itensLinha[1]);
                nome = itensLinha[0];
            }
        }

        System.out.println(nome+", "+max);

        scanner.close();
    }
}
