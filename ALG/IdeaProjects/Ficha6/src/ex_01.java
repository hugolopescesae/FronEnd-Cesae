import java.util.Scanner;

public class ex_01 {

    /**
     * A função imprime o barulho de um animal
     * @param animal Animal que vai fazer barulho
     */
    static void fazerBarulho(String animal){
        switch (animal){
            case "CAO":
                System.out.println("Au au au");
                break;
            case "GATO":
                System.out.println("Miau");
                break;
            case "PEIXE":
                System.out.println("Glub Glub");
                break;
            case "VACA":
                System.out.println("Muuuu");
                break;
            case "PORCO":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Barulho indefinido");
                break;
        }
    }

    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Delcarar Variável
        String animalEscolhido;

        System.out.println("Escolha o animal: ");
        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

    }
}
