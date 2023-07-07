import java.util.Scanner;

public class ex_11 {

    static int[] tamanhoArray(){
        // Instanciar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int counter;

        // Ler números do utilizador
        System.out.print("Introduza quantos número quer inserir no array: ");
        counter = input.nextInt();
        int [] array = new int[counter];

        // Ler número para o array
        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+(i+1)+" : ");
            array[i] = input.nextInt();
        }
        return array;
    }

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

    static void menu(){

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int opcao, num;
        String stop;

        int [] array = tamanhoArray();

        // Apresentar menu
        do {
            do {
                System.out.println("-------- MENU -------- \n 8 - Exercício Maior Número \n 9 - Exercício Menor Número \n 10 - Exercício Crescente \n Introduza o número correspondente a opção:");
                opcao = input.nextInt();
            }while (opcao < 8 || opcao >10);
            do {
                switch (opcao){
                    case 1:
                        System.out.println(maiorNumero(array));
                        break;
                    case 2:
                        System.out.println(menorNumero(array));
                        break;
                    case 3:
                        System.out.println(crescente(array));
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
