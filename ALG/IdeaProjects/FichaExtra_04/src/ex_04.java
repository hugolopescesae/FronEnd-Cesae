import java.util.Scanner;

public class ex_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array =  new int[10];
        int num, aux = 0;

        for (int i = 0;i < array.length;i++){
            System.out.print("Introduza o número "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Qual número quer verificar se existe no array: ");
        num = scanner.nextInt();

        for (int i = 0;i < array.length;i++){
            if (num == array[i]){
                System.out.println("Array["+i+"]");
            }else{
                aux++;
            }
        }

        if (aux > 0){
            System.out.print("O número não está no array!");
        }
    }
}
