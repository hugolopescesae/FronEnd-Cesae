import java.util.Scanner;

public class ex_11 {

    static int maiorNumero(int[] array){
        int maior = array[0];
        for (int i = 0;i < array.length;i++){
            if (maior < array[i]){
                maior = array[i];
            }
        }
        return maior;
    }

    static int menorNumero(int[] array){
        int menor = array[0];
        for (int i = 0;i < array.length;i++){
            if (menor > array[i]){
                menor = array[i];
            }
        }
        return menor;
    }

    static boolean crescente(int[] array){
        int aux = 0;
        for (int i = 1;i < array.length;i++){
            if (array[i]<=array[i-1]){
                aux = aux + 1;
            }
        }
        if (aux > 0){
            return false;
        }else{
            return true;
        }
    }

    static int[] preencher(){

        // Scanner
        Scanner input = new Scanner(System.in);

        // Tamanho do array
        System.out.println("Quantos números quer inserir no array: ");
        int counter = input.nextInt();

        int[] array = new int[counter];

        // Ler array do utilizador
        for (int i = 0;i < counter;i++){
            System.out.println("Introduza o número "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        return array;
    }

    static void menu(){

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int opcao;
        String stop;

        // Menu
        do {
            do {
                System.out.print("-------- MENU -------- \n8  - Exercício Maior Número \n9  - Exercício Menor Número \n10 - Exercício Primos \nIntroduza o número correspondente a opção: ");
                opcao = input.nextInt();
            }while (opcao < 8 || opcao > 10);
            do {
                switch (opcao){
                    case 8:
                        System.out.println(maiorNumero(preencher()));
                        break;
                    case 9:
                        System.out.println(menorNumero(preencher()));
                        break;
                    case 10:
                        System.out.println(crescente(preencher()));
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
