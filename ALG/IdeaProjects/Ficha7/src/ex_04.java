import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_04.csv");
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        while (scanner.hasNextLine()){
            linha = scanner.nextLine();
            String[] itensLinha = linha.split(";");
            for (int i = 0;i <itensLinha.length;i++){
                System.out.println("Vetor["+i+"] : "+itensLinha[i]);
            }
            System.out.println();
        }
        System.out.println();

        scanner.close();
    }
}
