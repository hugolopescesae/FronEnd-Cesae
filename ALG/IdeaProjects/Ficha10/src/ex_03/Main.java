package ex_03;

public class Main {
    public static void main(String[] args) {
        // Instanciar array de alimentos animal 1
        String []alimentosDoAnimal1 = {"Frango", "Melância", "Maça", "Ração"};

        // Intanciar animal
        Animal animal1 = new Animal("Niko","Cão - Sem Raça","Portugal",20,alimentosDoAnimal1);

        // Método para o animal comer
        System.out.println(animal1.animalComer("Batata",700));
        System.out.println(animal1.getPeso());

        System.out.println(animal1.animalComer("Frango",450));
        System.out.println(animal1.getPeso());
    }
}
