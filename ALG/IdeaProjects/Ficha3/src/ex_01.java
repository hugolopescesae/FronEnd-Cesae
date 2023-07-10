import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Printar números
        for (int i = 1;i <= 300;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}