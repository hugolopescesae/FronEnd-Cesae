import Enums.AlimentacaoAnimal;
import Enums.FamiliaPlanta;
import java.util.ArrayList;

public class MeioAmbiente {
    // Atributos do Meio Ambiente
    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    /**
     * Função Construtora do meio ambiente
     * @param nome
     * @param agua
     */
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<SerVivo>();
    }

    /**
     * Função para simular uma Planta a beber água
     * @param indexPlanta
     * @return boolean
     */
    public boolean plantaBebe(int indexPlanta) {
        Planta plantaAtual = (Planta) this.seres.get(indexPlanta);
        if (plantaAtual.getFamilia() == FamiliaPlanta.ARVORES && agua >= 1) {
            System.out.println("A planta "+plantaAtual.getNome()+" bebeu com sucesso!");
            this.agua -= 1;
            return true;
        }else if (plantaAtual.getFamilia() == FamiliaPlanta.FLORES && agua >= 0.1) {
            System.out.println("A planta "+plantaAtual.getNome()+" bebeu com sucesso!");
            this.agua -= 0.1;
            return true;
        }else if (plantaAtual.getFamilia() == FamiliaPlanta.ERVAS && agua >= 0.25) {
            System.out.println("A planta "+plantaAtual.getNome()+" bebeu com sucesso!");
            this.agua -= 0.25;
            return true;
        }else if (plantaAtual.getFamilia() == FamiliaPlanta.COMEINSETOS){
            System.out.println("A planta "+plantaAtual.getNome()+" não bebe água!");
            return false;
        }
        System.out.println("A planta "+plantaAtual.getNome()+" não bebeu! A planta morreu!");
        this.seres.remove(indexPlanta);
        return false;
    }

    /**
     * Função para simular um Animal a beber água
     * @param indexAnimal
     * @return boolean
     */
    public boolean animalBebe(int indexAnimal) {
        Animal animalAtual = (Animal) this.seres.get(indexAnimal);
        double animalAgua = animalAtual.getPeso()*0.025;
        if (animalAgua <= agua) {
            System.out.println("O animal "+animalAtual.getNome()+" bebeu com sucesso!");
            agua -= animalAgua;
            return true;
        }else{
            System.out.println("O animal "+animalAtual.getNome()+" não bebeu água e morreu de sede!");
            this.seres.remove(animalAtual);
            return false;
        }
    }

    /**
     * Função para simular uma Planta do tipo come Insetos a comer um Inseto
     * @param indexPlanta
     * @return boolean
     */
    public boolean plantaComeInsetos(int indexPlanta) {
        Planta plantaAtual = (Planta) this.seres.get(indexPlanta);
        if (plantaAtual.getFamilia() == FamiliaPlanta.COMEINSETOS) {
            for (SerVivo ser : this.seres) {
                if (ser instanceof Inseto) {
                    System.out.println("A planta "+plantaAtual.getNome()+" comeu o inseto "+ser.getNome()+"!");
                    this.seres.remove(ser);
                    return true;
                }
            }
            System.out.println("A planta "+plantaAtual.getNome()+" não comeu nenhum inseto, pois não existe nenhum inseto no meio ambiente!");
            this.seres.remove(plantaAtual);
        }
        return false;
    }

    /**
     * Função para simular uma Planta a abanar com o vento
     * @param indexPlanta
     */
    public void plantaAbanaComVento(int indexPlanta) {
        if (this.seres.get(indexPlanta) instanceof Planta) {
            System.out.println("Está muito vento!");
        }
    }

    /**
     * Função para simular uma Animal a fazer barulho
     * @param indexAnimal
     */
    public void animalFazBarulho(int indexAnimal) {
        if (this.seres.get(indexAnimal) instanceof Animal) {
            System.out.println(((Animal) this.seres.get(indexAnimal)).getBarulho());
        }
    }

    /**
     * Função para simular um Animal a movimentar-se
     * @param indexAnimal
     */
    public void animalMovimenta(int indexAnimal) {
        if (this.seres.get(indexAnimal) instanceof Animal) {
            System.out.println("O animal "+this.seres.get(indexAnimal).getNome()+" movimentou-se!");
        }
    }

    /**
     * Função para simular um Animal a comer
     * @param indexAnimal
     * @return boolean
     */
    public boolean animalCome(int indexAnimal) {
        Animal animalAtual = (Animal) this.seres.get(indexAnimal);
        for (SerVivo ser : this.seres) {
            if (ser instanceof Animal) {
                if (animalAtual.getAlimentacao() == AlimentacaoAnimal.CARNIVORO || animalAtual.getAlimentacao() == AlimentacaoAnimal.OMNIVORO) {
                    double indiceCapacidadeAnimalAtual = animalAtual.getPeso()+(animalAtual.getInteligencia()*2.5);
                    double indiceCapacidadeSer = ((Animal) ser).getPeso()+(((Animal) ser).getInteligencia()*2.5);
                    if (indiceCapacidadeAnimalAtual > indiceCapacidadeSer) {
                        System.out.println("O Animal "+animalAtual.getNome()+ "comeu o Animal "+ser.getNome());
                        this.seres.remove(ser);
                        animalAtual.setFome(false);
                        return true;
                    }else{
                        System.out.println("O Animal "+animalAtual.getNome()+ "não conseguiu comer "+ser.getNome());
                        animalAtual.setFome(true);
                        return false;
                    }
                }
            }else if (ser instanceof Planta) {
                if (animalAtual.getAlimentacao() == AlimentacaoAnimal.HERBIVORO || animalAtual.getAlimentacao() == AlimentacaoAnimal.OMNIVORO) {
                    if (((Planta) ser).getGrauDeDefesa() == 0 && animalAtual.getInteligencia() >= 0) {
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+ser.getNome());
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }else if (((Planta) ser).getGrauDeDefesa() == 1 && animalAtual.getInteligencia() >= 20) {
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+ser.getNome());
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }else if (((Planta) ser).getGrauDeDefesa() == 2 && animalAtual.getInteligencia() >= 40) {
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+ser.getNome());
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }else if (((Planta) ser).getGrauDeDefesa() == 3 && animalAtual.getInteligencia() >= 60) {
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+ser.getNome());
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }else if (((Planta) ser).getGrauDeDefesa() == 4 && animalAtual.getInteligencia() >= 80) {
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+ser.getNome());
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }else if (((Planta) ser).getGrauDeDefesa() == 5 && animalAtual.getInteligencia() >= 95) {
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+ser.getNome());
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }else{
                        System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer a Planta "+ser.getNome());
                        animalAtual.setFome(true);
                        return false;
                    }
                }
            }else{
                if (animalAtual.getAlimentacao() == AlimentacaoAnimal.CARNIVORO || animalAtual.getAlimentacao() == AlimentacaoAnimal.OMNIVORO) {
                    if (((Inseto) ser).isVenenoso()){
                        System.out.println("O Animal "+animalAtual.getNome()+" morreu porque o Inseto era venenoso!");
                        return false;
                    }else{
                        System.out.println("O Animal "+animalAtual.getNome()+" comeu o Inseto "+ser.getNome()+"!");
                        animalAtual.setFome(false);
                        this.seres.remove(ser);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Função para simular um Inseto a fazer barulho
     */
    public void insetoChateia() {
        int random = (int)(Math.random() * 3) + 1;

        if (random == 1) {
            System.out.println("Bzzzz bzzzz");
        }else if (random == 2) {
            System.out.println("Tic tic tic tic");
        }else if (random == 3) {
            System.out.println("Pssssssss");
        }
    }

    /**
     * Função para adicionar um SerVivo ao array seres
     * @param serVivo
     */
    public void addSerVivo(SerVivo serVivo) {
        if (serVivo instanceof Animal) {
            this.seres.add((Animal) serVivo);
        }else if (serVivo instanceof Planta) {
            this.seres.add((Planta) serVivo);
        }else{
            this.seres.add((Inseto) serVivo);
        }
    }

    /**
     * Função para imprimir todos os detalhes do SerVivo, tendo em consideração o seu tipo (Animal, Planta, Inseto)
     */
    public void  printarSeresVivosPresentes() {
        for (SerVivo ser : this.seres) {
            if (ser instanceof Animal) {
                ((Animal) ser).imprimirDetalhesAnimal();
            }else if (ser instanceof Planta) {
                ((Planta) ser).imprimirDetalhesPlanta();
            }else{
                ((Inseto) ser).imprimirDetalhesInseto();
            }
        }
    }

    /**
     * Função simuladora do meio ambiente
     * @param numDias
     */
    public void simulador(int numDias) {
<<<<<<< Updated upstream
        
=======
        for (int i = 0; i < numDias;i++) { // Simular o número de dias
            for (int j = 0;j < 3;j++) { // Simular os três momentos do dia (Manhã, Tarde e Noite)
                // Guardar Animais num arrayAnimais
                ArrayList<Animal> arrayAnimais = new ArrayList<Animal>();
                for (SerVivo ser : this.seres) {
                    if (ser instanceof Animal){
                        arrayAnimais.add((Animal) ser);
                    }
                }

                int randomAcontecimento = (int)(Math.random() * 4) + 1;
                int randomNumber;

                switch (randomAcontecimento) {
                    case 1:
                        int indexPlanta = (int)(Math.random() * this.seres.size());
                        Planta planta = (Planta) this.seres.get(indexPlanta);

                        if (planta.getFamilia() == FamiliaPlanta.COMEINSETOS){
                            randomNumber = (int)(Math.random() * 3) + 1;
                        }else{
                            randomNumber = (int)(Math.random() * 2) + 1;
                        }

                        switch (randomNumber) {
                            case 1:
                                plantaAbanaComVento(indexPlanta);
                            case 2:
                                plantaBebe(indexPlanta);
                            case 3:
                                plantaComeInsetos(indexPlanta);
                        }
                        break;
                    case 2:
                        int indexAnimal = (int)(Math.random() * this.seres.size());
                        Animal animal = (Animal) this.seres.get(indexAnimal);

                        randomNumber = (int)(Math.random() * 4) + 1;

                        switch (randomNumber) {
                            case 1:
                                animalFazBarulho(indexAnimal);
                            case 2:
                                animalMovimenta(indexAnimal);
                            case 3:
                                animalBebe(indexAnimal);
                            case 4:
                                animalCome(indexAnimal);
                        }
                        break;
                    case 3:
                        insetoChateia();
                    case 4:
                        randomNumber = (int)(Math.random() * 3) + 1;

                        switch (randomNumber) {
                            case 1:
                                this.agua /= 2;
                            case 2:
                                this.agua *= 2;
                            case 3:
                                int qtdAnimais = 0;
                                int qtdPlantas = 0;
                                for (SerVivo ser : this.seres) {
                                    if (ser instanceof Animal) {
                                        qtdAnimais++;
                                    }else if (ser instanceof Planta){
                                        qtdPlantas++;
                                    }
                                }
                                
                        }
                }
            }
        }
>>>>>>> Stashed changes
    }
}
