import java.util.Scanner;

public class ex_06 {

    // A função imprime se o número é par ou não!
    static boolean numPar(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    // A função imprime se o número é positivo ou não!
    static boolean positivo(int num){
        if (num >= 0){
            return true;
        }else{
            return false;
        }
    }

    // A função imprime se o número é primo ou não!
    static boolean primo(int num){
        if (num <=1){
            return false;
        }else{
            for (int i = 2;i < num;i++){
                if (num % i ==0){
                    return false;
                }
            }
            return true;
        }
    }

    // A função imprime se o número é perfeito ou não!
    static boolean perfeito(int num){
        int aux = 0;
        for (int i = 1;i < num;i++){
            if (num % i == 0){
                aux = aux + i;
            }
            if (aux == num){
                return true;
            }
        }
        return false;
    }

    // A função imprime o menu
    static void menu(){

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int opcao, num;
        String stop;

        // Apresentar menu
        do {
            do {
                System.out.println("-------- MENU -------- \n 1 - Exercício Pares \n 2 - Exercício Positivos \n 3 - Exercício Primos \n 4 - Exercício Perfeitos \n Introduza o número correspondente a opção:");
                opcao = input.nextInt();
            }while (opcao < 1 || opcao > 4);
            do {
                switch (opcao){
                    case 1:
                        System.out.println("1 - Exercício Pares");
                        System.out.print("Introduza um número: ");
                        num = input.nextInt();
                        System.out.println(numPar(num));
                        break;
                    case 2:
                        System.out.println("2 - Exercício Positivos");
                        System.out.print("Introduza um número: ");
                        num = input.nextInt();
                        System.out.println(positivo(num));
                        break;
                    case 3:
                        System.out.println("3 - Exercício Primos");
                        System.out.print("Introduza um número: ");
                        num = input.nextInt();
                        System.out.println(primo(num));
                        break;
                    case 4:
                        System.out.println("4 - Exercício Perfeitos");
                        System.out.print("Introduza um número: ");
                        num = input.nextInt();
                        System.out.println(perfeito(num));
                        break;
                }
                System.out.println("Pretende repetir o valor/opção introduzida?(s/n)");
                stop = input.next();
            }while (stop.equals("s"));
            System.out.println("Pretende fazer outro exercício?(s/n)");
            stop = input.next();
        }while (stop.equals("s"));
    }

    public static void main(String[] args) {
        menu();
    }
}
