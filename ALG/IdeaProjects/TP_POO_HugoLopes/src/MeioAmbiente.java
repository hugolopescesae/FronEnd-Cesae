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
        Planta plantaAtual;
        if (this.seres.get(indexPlanta) instanceof Planta) {
            plantaAtual = (Planta) this.seres.get(indexPlanta);
        } else {
            System.out.println("Nesta posição não existe nenhuma Planta!");
            return false;
        }

        if (plantaAtual != null) {
            if (plantaAtual.getFamilia() == FamiliaPlanta.ARVORES && agua >= 1) {
                System.out.println("A Planta "+plantaAtual.getNome()+" bebeu com sucesso!");
                this.agua -= 1;
                return true;
            }else if (plantaAtual.getFamilia() == FamiliaPlanta.FLORES && agua >= 0.1) {
                System.out.println("A Planta "+plantaAtual.getNome()+" bebeu com sucesso!");
                this.agua -= 0.1;
                return true;
            }else if (plantaAtual.getFamilia() == FamiliaPlanta.ERVAS && agua >= 0.25) {
                System.out.println("A Planta "+plantaAtual.getNome()+" bebeu com sucesso!");
                this.agua -= 0.25;
                return true;
            }else if (plantaAtual.getFamilia() == FamiliaPlanta.COMEINSETOS){
                System.out.println("A Planta "+plantaAtual.getNome()+" não bebe água!");
                return false;
            }
            System.out.println("A planta "+plantaAtual.getNome()+" não bebeu! A Planta morreu!");
            this.seres.remove(indexPlanta);
        }else {
            System.out.println("Não existe nenhuma Planta no meio ambiente!");
        }

        return false;
    }

    /**
     * Função para simular um Animal a beber água
     * @param indexAnimal
     * @return boolean
     */
    public boolean animalBebe(int indexAnimal) {
        Animal animalAtual;
        if (this.seres.get(indexAnimal) instanceof Animal) {
            animalAtual = (Animal) this.seres.get(indexAnimal);
        } else {
            System.out.println("Nesta posição não existe nenhum Animal!");
            return false;
        }

        if (animalAtual != null) {
            if (animalAtual.getPeso()*0.025 <= this.agua) {
                System.out.println("O Animal "+animalAtual.getNome()+" bebeu com sucesso!");
                this.agua -= animalAtual.getPeso()*0.025;
                return true;
            } else {
                System.out.println("O Animal "+animalAtual.getNome()+" não bebeu! O Animal morreu!");
                this.seres.remove(indexAnimal);
                return false;
            }
        }

        return false;
    }

    /**
     * Função para simular uma Planta do tipo come Insetos a comer um Inseto
     * @param indexPlanta
     * @return boolean
     */
    public boolean plantaComeInsetos(int indexPlanta) {
        Planta plantaAtual;
        if (this.seres.get(indexPlanta) instanceof Planta && ((Planta) this.seres.get(indexPlanta)).getFamilia() == FamiliaPlanta.COMEINSETOS) {
            plantaAtual = (Planta) this.seres.get(indexPlanta);
        } else {
            System.out.println("Nesta posição não existe nenhuma Planta!");
            return false;
        }

        if (plantaAtual != null) {
            for (int i = 0;i < this.seres.size();i++) {
                if (this.seres.get(i) instanceof Inseto) {
                    System.out.println("A Planta "+plantaAtual.getNome()+" comeu o Inseto "+this.seres.get(i).getNome()+"!");
                    this.seres.remove(i);
                    return true;
                }
            }
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
        } else {
            System.out.println("Nesta posição não existe nenhuma Planta!");
        }
    }

    /**
     * Função para simular uma Animal a fazer barulho
     * @param indexAnimal
     */
    public void animalFazBarulho(int indexAnimal) {
        if (this.seres.get(indexAnimal) instanceof Animal) {
            System.out.println("O animal "+this.seres.get(indexAnimal).getNome()+" fez barulho: "+((Animal) this.seres.get(indexAnimal)).getBarulho()+"!");
        } else {
            System.out.println("Nesta posição não existe nenhum Animal!");
        }
    }

    /**
     * Função para simular um Animal a movimentar-se
     * @param indexAnimal
     */
    public void animalMovimenta(int indexAnimal) {
        if (this.seres.get(indexAnimal) instanceof Animal) {
            System.out.println("O animal "+this.seres.get(indexAnimal).getNome()+" movimentou-se!");
        } else {
            System.out.println("Nesta posição não existe nenhum Animal!");
        }
    }

    /**
     * Função para simular um Animal a comer
     * @param indexAnimal
     * @return boolean
     */
    public boolean animalCome(int indexAnimal) {
        Animal animalAtual;
        if (this.seres.get(indexAnimal) instanceof Animal) {
            animalAtual = (Animal) this.seres.get(indexAnimal);
        } else {
            System.out.println("Nesta posição não existe nenhuma Planta!");
            return false;
        }

        if (animalAtual != null) {
            if (!animalAtual.isFome()) {
                System.out.println("O Animal está de barriga cheia!");
                return true;
            } else {
                if (animalAtual.getAlimentacao() == AlimentacaoAnimal.CARNIVORO) {
                    for (int i = 0;i < this.seres.size();i++) {
                        if (animalAtual == this.seres.get(i)) {
                            // Se o Animal selecionado for igual ao animalAtual, passa a frente esse animal!
                        } else if (this.seres.get(i) instanceof Animal) {
                            if ((animalAtual.getPeso()+(animalAtual.getInteligencia()*2.5)) > (((Animal) this.seres.get(i)).getPeso()+(((Animal) this.seres.get(i)).getInteligencia()+2.5))) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a presa "+this.seres.get(i).getNome()+"!");
                                ((Animal) this.seres.get(indexAnimal)).setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else {
                                System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer a presa "+this.seres.get(i).getNome()+"!");
                                ((Animal) this.seres.get(indexAnimal)).setFome(true);
                                return false;
                            }
                        } else if (this.seres.get(i) instanceof Inseto) {
                            if (((Inseto) this.seres.get(i)).isVenenoso()) {
                                System.out.println("O Animal "+animalAtual.getNome()+" morreu envenenado pelo Inseto "+this.seres.get(i).getNome()+"!");
                                this.seres.remove(indexAnimal);
                                return false;
                            } else {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu o Inseto "+this.seres.get(i).getNome()+"!");
                                this.seres.remove(i);
                                return true;
                            }
                        }
                    }
                    System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer pois não existe nenhum Animal ou Inseto no meio ambiente!");
                    animalAtual.setFome(true);
                } else if (animalAtual.getAlimentacao() == AlimentacaoAnimal.HERBIVORO) {
                    for (int i = 0;i < this.seres.size();i++) {
                        if (this.seres.get(i) instanceof Planta) {
                            if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 0 && animalAtual.getInteligencia() >= 0) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i).getNome()+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 1 && animalAtual.getInteligencia() >= 20) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i).getNome()+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 2 && animalAtual.getInteligencia() >= 40) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i).getNome()+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 3 && animalAtual.getInteligencia() >= 60) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 4 && animalAtual.getInteligencia() >= 80) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 5 && animalAtual.getInteligencia() >= 95) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else {
                                System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer a Planta "+this.seres.get(i).getNome()+"!");
                                animalAtual.setFome(true);
                                return false;
                            }
                        }
                    }
                    System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer pois não existe nenhuma Planta no meio ambiente!");
                    animalAtual.setFome(true);
                } else {
                    for (int i = 0;i < this.seres.size();i++) {
                        if (animalAtual == this.seres.get(i)) {
                            // Se o Animal selecionado for igual ao animalAtual, passa a frente esse animal!
                        } else if (this.seres.get(i) instanceof Animal) {
                            if ((animalAtual.getPeso()+(animalAtual.getInteligencia()*2.5)) > (((Animal) this.seres.get(i)).getPeso()+(((Animal) this.seres.get(i)).getInteligencia()+2.5))) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a presa "+this.seres.get(i).getNome()+"!");
                                ((Animal) this.seres.get(indexAnimal)).setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else {
                                System.out.println("O Animal "+animalAtual.getNome()+" não comeu!");
                                ((Animal) this.seres.get(indexAnimal)).setFome(true);
                                return false;
                            }
                        } else if (this.seres.get(i) instanceof Inseto) {
                            if (((Inseto) this.seres.get(i)).isVenenoso()) {
                                System.out.println("O Animal "+animalAtual.getNome()+" morreu envenenado pelo Inseto "+this.seres.get(i).getNome()+"!");
                                this.seres.remove(indexAnimal);
                                return false;
                            } else {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu o Inseto "+this.seres.get(i).getNome()+"!");
                                this.seres.remove(i);
                                return true;
                            }
                        } else {
                            if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 0 && animalAtual.getInteligencia() >= 0) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 1 && animalAtual.getInteligencia() >= 20) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 2 && animalAtual.getInteligencia() >= 40) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 3 && animalAtual.getInteligencia() >= 60) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 4 && animalAtual.getInteligencia() >= 80) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else if (((Planta) this.seres.get(i)).getGrauDeDefesa() == 5 && animalAtual.getInteligencia() >= 95) {
                                System.out.println("O Animal "+animalAtual.getNome()+" comeu a Planta "+this.seres.get(i)+"!");
                                animalAtual.setFome(false);
                                this.seres.remove(i);
                                return true;
                            } else {
                                System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer a Planta "+this.seres.get(i).getNome()+"!");
                                animalAtual.setFome(true);
                                return false;
                            }
                        }
                    }
                    System.out.println("O Animal "+animalAtual.getNome()+" não conseguiu comer pois não existe nenhum SerVivo no meio ambiente!");
                    animalAtual.setFome(true);
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
        for (int i = 0;i < this.seres.size();i++) {
            System.out.println("- - - - - - - - - -");
            if (this.seres.get(i) instanceof Animal) {
                ((Animal) this.seres.get(i)).imprimirDetalhesAnimal();
            } else if (this.seres.get(i) instanceof Planta) {
                ((Planta) this.seres.get(i)).imprimirDetalhesPlanta();
            } else {
                ((Inseto) this.seres.get(i)).imprimirDetalhesInseto();
            }
            System.out.println("- - - - - - - - - -");
            System.out.println("");
        }
    }

    /**
     * Função simuladora do meio ambiente
     * @param numDias
     */
    public void simulador(int numDias) {
        for (int i = 0;i < numDias;i++) {
            System.out.println("");
            System.out.println("Um novo dia começa no Meio Ambiente! (Dia "+(i+1)+")");

            for (int l = 0;l < this.seres.size();l++) {
                if (this.seres.get(l) instanceof Animal) {
                    ((Animal) this.seres.get(l)).setFome(true);
                }
            }

            for (int j = 0;j < 3;j++) {
                if (j == 0) {
                    System.out.println("- - - - - - - - - -");
                    System.out.println("Manhã");
                } else if (j == 1) {
                    System.out.println("- - - - - - - - - -");
                    System.out.println("Tarde");
                } else {
                    System.out.println("- - - - - - - - - -");
                    System.out.println("Noite");
                }

                int randomAcontecimento = (int) ((Math.random() * 4) + 1);
                ArrayList<Animal> arrayAnimal = new ArrayList<Animal>();
                ArrayList<Planta> arrayPlanta = new ArrayList<Planta>();

                for (int l = 0;l <this.seres.size();l++) {
                    if (this.seres.get(l) instanceof Animal) {
                        arrayAnimal.add((Animal) this.seres.get(l));
                    }
                }

                for (int l = 0;l < this.seres.size();l++) {
                    if (this.seres.get(l) instanceof Planta) {
                        arrayPlanta.add((Planta) this.seres.get(l));
                    }
                }

                switch (randomAcontecimento) {
                    case 1: // Acontecimento das Plantas
                        int randomNumPlanta = (int) ((Math.random() * 3) + 1);

                        if (arrayPlanta.size() == 0) {
                            System.out.println("Não existem Plantas no meio ambiente!");
                            break;
                        }

                        for (int k = 0;k < this.seres.size();k++) {
                            if (this.seres.get(k) instanceof Planta) {
                                if (randomNumPlanta == 1) {
                                    plantaAbanaComVento(k);
                                } else if (randomNumPlanta == 2) {
                                    plantaBebe(k);
                                } else if (randomNumPlanta == 3 && ((Planta) this.seres.get(k)).getFamilia() == FamiliaPlanta.COMEINSETOS) {
                                    plantaComeInsetos(k);
                                } else if (randomNumPlanta == 3) {
                                    System.out.println("A Planta "+this.seres.get(k).getNome()+" não come insetos!");
                                }
                                break;
                            }
                        }
                        break;
                    case 2: // Acontecimento dos Animais
                        int randomNumAnimal = (int) ((Math.random() * 4) + 1);

                        if (arrayAnimal.size() == 0) {
                            System.out.println("Não existem Animais no meio ambiente!");
                            break;
                        }

                        for (int k = 0;k < this.seres.size();k++) {
                            if (this.seres.get(k) instanceof Animal) {
                                if (randomNumAnimal == 1) {
                                    animalFazBarulho(k);
                                } else if (randomNumAnimal == 2) {
                                    animalMovimenta(k);
                                } else if (randomNumAnimal == 3) {
                                    animalBebe(k);
                                } else if (randomNumAnimal == 4) {
                                    animalCome(k);
                                }
                                break;
                            }
                        }
                        break;
                    case 3: // Acontecimento dos Insetos
                        insetoChateia();
                        break;
                    case 4: // Acontecimento das Catástrofes Naturais
                        int randomNumCatastrofe = (int) ((Math.random() * 3) + 1);

                        if (randomNumCatastrofe == 1) {
                            System.out.println("Seca");
                            this.agua /= 2;
                        } else if (randomNumCatastrofe == 2) {
                            System.out.println("Chuvas");
                            this.agua *= 2;
                        } else if (randomNumCatastrofe == 3) {
                            System.out.println("Erupção Vulcânica");
                            int qtdAnimais = 0;
                            int qtdPlantas = 0;
                            int counter = 0;

                            for (int k = 0;k < this.seres.size();k++) {
                                if (this.seres.get(k) instanceof Animal) {
                                    qtdAnimais++;
                                } else if (this.seres.get(k) instanceof Planta) {
                                    qtdPlantas++;
                                }
                            }

                            for (int k = 0;k < this.seres.size();k++) {
                                if (this.seres.get(k) instanceof Animal) {
                                    System.out.println("O Animal "+this.seres.get(k).getNome()+" morreu!");
                                    this.seres.remove(k);
                                    counter++;
                                }
                                if (counter == qtdAnimais/2) {
                                    break;
                                }
                            }

                            counter = 0;

                            for (int k = 0;k < this.seres.size();k++) {
                                if (this.seres.get(k) instanceof Planta) {
                                    System.out.println("A Planta "+this.seres.get(k).getNome()+" morreu!");
                                    this.seres.remove(k);
                                    counter++;
                                }
                                if (counter == qtdPlantas/2) {
                                    break;
                                }
                            }
                        }
                        break;
                }

                if (j == 2) {
                    if (arrayAnimal.size() > 0) {
                        System.out.println("- - - - - - - - - -");
                        System.out.println("Os Animais com fome vão ao ataque!");
                    }

                    System.out.println(" ");
                    for (int k = 0;k < this.seres.size();k++) {
                        if (this.seres.get(k) instanceof Animal && ((Animal) this.seres.get(k)).isFome()) {
                            if (!animalCome(k)) {
                                this.seres.remove(k);
                            }
                        }
                    }
                }
            }
        }
        printarSeresVivosPresentes();
    }
}
