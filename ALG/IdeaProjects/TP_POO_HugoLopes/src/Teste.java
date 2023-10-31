import Enums.AlimentacaoAnimal;
import Enums.FamiliaPlanta;

public class Teste {
    public static void main(String[] args) {
        // Instância de Plantas
        Planta planta1 = new Planta("Rosa","Rosa indica","Brasil",2,FamiliaPlanta.ARVORES,4);
        Planta planta2 = new Planta("Pinheiro","Pinus sylvestris","Canadá",15,FamiliaPlanta.ARVORES,3);
        Planta planta3 = new Planta("Lavanda","Lavandula angustifolia","França",5,FamiliaPlanta.ERVAS,2);
        Planta planta4 = new Planta("Orquídea","Phalaenopsis","Tailândia",3,FamiliaPlanta.FLORES,4);
        Planta planta5 = new Planta("Bambu","Bambusoideae","China",8,FamiliaPlanta.ARVORES,2);
        Planta planta6 = new Planta("Hortelã","Mentha spicata","Índia",1,FamiliaPlanta.ERVAS,1);
        Planta planta7 = new Planta("Venus Flytrap","Dionaea muscipula","Estados Unidos",4,FamiliaPlanta.COMEINSETOS,5);
        Planta planta8 = new Planta("Girassol","Helianthus annuus","Argentina",2,FamiliaPlanta.FLORES,3);
        Planta planta9 = new Planta("Tomilho","Thymus vulgaris","Grécia",3,FamiliaPlanta.ERVAS,2);
        Planta planta10 = new Planta("Abacateiro","Persea americana","México",10,FamiliaPlanta.ARVORES,2);

        // Instância de Animais
        Animal animal1 = new Animal("Leão", "Panthera leo", "África", 7, true, 190.5, 65, AlimentacaoAnimal.CARNIVORO, "Rugido");
        Animal animal2 = new Animal("Elefante", "Loxodonta africana", "África", 25, true, 4500.0, 70, AlimentacaoAnimal.HERBIVORO, "Trombeta");
        Animal animal3 = new Animal("Panda", "Ailuropoda melanoleuca", "China", 8, true, 85.0, 55, AlimentacaoAnimal.HERBIVORO, "Grunhido");
        Animal animal4 = new Animal("Lobo", "Canis lupus", "América do Norte", 10, true, 40.0, 60, AlimentacaoAnimal.CARNIVORO, "Uivo");
        Animal animal5 = new Animal("Macaco", "Macaca mulatta", "Índia", 6, true, 8.0, 45, AlimentacaoAnimal.OMNIVORO, "Grito");
        Animal animal6 = new Animal("Girafa", "Giraffa camelopardalis", "África", 15, true, 1600.0, 50, AlimentacaoAnimal.HERBIVORO, "Sibilo");
        Animal animal7 = new Animal("Coruja", "Strigiformes", "Mundo", 3, false, 0.5, 70, AlimentacaoAnimal.CARNIVORO, "Pio");
        Animal animal8 = new Animal("Urso-polar", "Ursus maritimus", "Ártico", 12, true, 600.0, 50, AlimentacaoAnimal.CARNIVORO, "Rugido");
        Animal animal9 = new Animal("Cavalo", "Equus ferus caballus", "Mundo", 9, true, 600.0, 50, AlimentacaoAnimal.HERBIVORO, "Relincho");
        Animal animal10 = new Animal("Crocodilo", "Crocodylus niloticus", "África", 30, true, 1000.0, 30, AlimentacaoAnimal.CARNIVORO, "Rugido");

        // Instância de Insetos
        Inseto inseto1 = new Inseto("Vespa", "Vespa vulgaris", "Brasil", 1, true);
        Inseto inseto2 = new Inseto("Borboleta", "Papilio machaon", "França", 2, false);
        Inseto inseto3 = new Inseto("Joaninha", "Coccinella septempunctata", "EUA", 0, false);
        Inseto inseto4 = new Inseto("Formiga", "Camponotus chromaiodes", "Austrália", 3, false);
        Inseto inseto5 = new Inseto("Besouro", "Coleoptera", "México", 4, false);
        Inseto inseto6 = new Inseto("Aracnídeo", "Arachnida", "Mundo", 5, true);
        Inseto inseto7 = new Inseto("Libélula", "Libellula quadrimaculata", "Canadá", 2, false);
        Inseto inseto8 = new Inseto("Mosquito", "Culex pipiens", "Índia", 1, true);
        Inseto inseto9 = new Inseto("Gafanhoto", "Locusta migratoria", "África", 1, false);
        Inseto inseto10 = new Inseto("Barata", "Blattodea", "China", 2, false);

        MeioAmbiente meioAmbiente = new MeioAmbiente("Selva", 500);

        meioAmbiente.addSerVivo(planta1);
        meioAmbiente.addSerVivo(planta2);
        meioAmbiente.addSerVivo(planta3);
        meioAmbiente.addSerVivo(planta4);
        meioAmbiente.addSerVivo(planta5);
        meioAmbiente.addSerVivo(planta6);
        meioAmbiente.addSerVivo(planta7);
        meioAmbiente.addSerVivo(planta8);
        meioAmbiente.addSerVivo(planta9);
        meioAmbiente.addSerVivo(planta10);

        meioAmbiente.addSerVivo(animal1);
        meioAmbiente.addSerVivo(animal2);
        meioAmbiente.addSerVivo(animal3);
        meioAmbiente.addSerVivo(animal4);
        meioAmbiente.addSerVivo(animal5);
        meioAmbiente.addSerVivo(animal6);
        meioAmbiente.addSerVivo(animal7);
        meioAmbiente.addSerVivo(animal8);
        meioAmbiente.addSerVivo(animal9);
        meioAmbiente.addSerVivo(animal10);

        meioAmbiente.addSerVivo(inseto1);
        meioAmbiente.addSerVivo(inseto2);
        meioAmbiente.addSerVivo(inseto3);
        meioAmbiente.addSerVivo(inseto4);
        meioAmbiente.addSerVivo(inseto5);
        meioAmbiente.addSerVivo(inseto6);
        meioAmbiente.addSerVivo(inseto7);
        meioAmbiente.addSerVivo(inseto8);
        meioAmbiente.addSerVivo(inseto9);
        meioAmbiente.addSerVivo(inseto10);

        meioAmbiente.simulador(10);
    }
}
