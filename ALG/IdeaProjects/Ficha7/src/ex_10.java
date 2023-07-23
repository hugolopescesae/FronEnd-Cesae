import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_10 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_10.csv");
        Scanner scanner = new Scanner(file);

        String linha;
        double soma = 0;
        linha = scanner.nextLine();

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(",");
            soma += Double.parseDouble(itensLinha[3]);
        }

        System.out.println("O valor total das vendas foi: "+soma);

        scanner.close();
    }
}
