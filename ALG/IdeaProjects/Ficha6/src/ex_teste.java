import java.util.Scanner;

public class ex_teste {


    public static boolean primo(int num){
        int divisor=2;

        if (num<=1){
            return false;
        }
        while (divisor<num){
            if (num%divisor==0){
                return false;
            }
            divisor++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(primo(num));

    }
}
