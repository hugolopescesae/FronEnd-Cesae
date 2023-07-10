import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num, iv1 = 0, iv2 = 0, iv3 = 0, iv4 = 0;

        // Ler num
        for (int i = 0;i != -1;i++){
            System.out.print("Introduza o número "+i+" : ");
            num = input.nextInt();
            if (num == -1){
                break;
            }else if (num < 26){
                iv1 += 1;
            }else if (num < 51){
                iv2 += 1;
            }else if (num < 76){
                iv3 += 1;
            }else if (num < 101){
                iv4 += 1;
            }else{
                System.out.println("Introduza números positivos!");
                break;
            }
        }
        // Apresentar intervalos
        System.out.println("Intervalo [0,25]: "+iv1+"\nIntervalo [26,50]: "+iv2+"\nIntervalo [51,75]: "+iv3+"\nIntervalo [76,100]: "+iv4);
    }
}
