public class ex_05_03 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05_03 *****");

        for (int i = 1;i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
