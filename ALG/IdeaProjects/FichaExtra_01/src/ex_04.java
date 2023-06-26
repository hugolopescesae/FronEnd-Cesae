import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 04 *****");

        Scanner input = new Scanner(System.in);

        // Declara Variável
        String letra;

        // Ler letra do utilizador
        System.out.print("Introduza um letra do alfabeto (apenas letras minúsculas): ");
        letra = input.next();

        // Verificar se vogal ou consoante
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("A letra intoduzida é uma vogal!");
        }else if (letra.equals("b") || letra.equals("c") || letra.equals("d") || letra.equals("f") || letra.equals("g") || letra.equals("h") || letra.equals("j") || letra.equals("k") || letra.equals("l") || letra.equals("m") || letra.equals("n") || letra.equals("p") || letra.equals("q") || letra.equals("r") || letra.equals("s") || letra.equals("t") || letra.equals("w") || letra.equals("x") || letra.equals("y") || letra.equals("z")){
            System.out.println("A letra intoduzida é uma consosante!");
        }else{
            System.out.println("Introduza apenas letras (minúsculas)!");
        }
    }
}
