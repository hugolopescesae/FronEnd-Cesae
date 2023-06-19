import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 13 *****" );

        // Instanciar Scanner (Linha obrigatória para ler dados da consola)
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int horas, minutos;

        // Ler horário do utilizador
        System.out.print("Introduza uma hora (no formato 24 horas): ");
        horas= input.nextInt();
        System.out.print("Introduza os minutos: ");
        minutos= input.nextInt();

        // Calcular e Apresentar horário no formato 12 horas
        if (horas>=0 && horas<=12 && minutos<=59){
            System.out.println("O horário no formato de 12 horas será: "+horas+":"+minutos);
        }else{
            if (horas>=12 && horas<=24 && minutos<=59){
                System.out.println("O horário no formato de 12 horas será: "+(horas-12)+":"+minutos);
            }else{
                System.out.println("Por favor, insira novamente os dados de forma válida!");
            }
        }
    }
}
