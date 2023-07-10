import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int segundosTotais=0, tempoMusica, horas, minutos, segundos;

        // Ler minutos da música1
        System.out.print("Insira os minutos da música 1: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da música1
        System.out.print("Insira os segundos da música 1: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da música2
        System.out.print("Insira os minutos da música 2: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da música2
        System.out.print("Insira os segundos da música 2: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da música3
        System.out.print("Insira os minutos da música 3: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da música3
        System.out.print("Insira os segundos da música 3: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da música4
        System.out.print("Insira os minutos da música 4: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da música4
        System.out.print("Insira os segundos da música 4: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Ler minutos da música5
        System.out.print("Insira os minutos da música 5: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        // Ler segundos da música5
        System.out.print("Insira os segundos da música 5: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        // Converter segundos para minutos
        horas=segundosTotais/3600;
        minutos=(segundosTotais/60)-(horas*60);
        segundos=(segundosTotais)-(horas*3600)-(minutos*60);

        // Apresentar duração do álbum
        System.out.print("A duração do álbum é: "+horas+"h"+minutos+"m"+segundos+"s");

    }
}
