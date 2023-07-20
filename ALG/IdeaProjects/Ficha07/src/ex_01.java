import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex_01 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/exercicio_01.txt");
        Scanner input = new Scanner(file);

        System.out.println(input.nextLine());

        input.close();
    }
}
