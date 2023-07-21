import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_05 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_05.txt");
        Scanner scanner = new Scanner(file);

        int num, soma = 0;

        while (scanner.hasNextInt()){
            num = scanner.nextInt();
            soma += num;
        }
        System.out.println("O valor da soma é: "+soma);

        scanner.close();
    }
}
