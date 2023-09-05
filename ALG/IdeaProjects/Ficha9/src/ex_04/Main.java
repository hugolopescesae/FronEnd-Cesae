package ex_04;

public class Main {
    public static void main(String[] args) {

        // Instanciar um circulo
        Circulo circulo1 = new Circulo(20);

        // Calcular área do circulo
        System.out.println("Área: "+circulo1.getRaio()*circulo1.getPI());

        // Calcular o perímetro do circulo
        System.out.println("Perímetro: "+(2*circulo1.getPI()* circulo1.getRaio()));
    }
}
