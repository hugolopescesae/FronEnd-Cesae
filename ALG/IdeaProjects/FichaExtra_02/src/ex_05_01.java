public class ex_05_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 05_01 *****");

        for (int i = 1;i < 5;i++){
            System.out.print(i);
            for (int j = 1; j < i;j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}
