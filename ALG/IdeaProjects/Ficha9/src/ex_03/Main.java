package ex_03;

public class Main {
    public static void main(String[] args) {
        // Instanciar Retângulo
        Retângulo retangulo = new Retângulo(20,10);

        // Calcular Área
        System.out.println(retangulo.getAltura() * retangulo.getLargura());

        // Calcular Perímetro
        System.out.println((retangulo.getAltura()*2) + (retangulo.getLargura()*2));

    }
}
