public class ex_05_02 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05_02 *****");


        for (int i = 1; i <= 5; i++) {
            for (int j = 1;j <= 5 - i;j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= 2 * i - 1;k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
