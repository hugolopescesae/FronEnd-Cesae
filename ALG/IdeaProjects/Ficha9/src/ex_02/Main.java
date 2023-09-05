package ex_02;

public class Main {
    public static void main(String[] args) {

        // Instanciar Cães
        Cao cao1 = new Cao("Fido", "Labrador");
        Cao cao2 = new Cao("Spot", "Pitbull");
        Cao cao3 = new Cao("Niko", "Sem raça");

        // Método Ladrar
        System.out.println(cao1.getLatido());

        // Modificar o latido
        cao1.setLatido("Wooooooff!");
        System.out.println(cao1.getLatido());
    }
}
