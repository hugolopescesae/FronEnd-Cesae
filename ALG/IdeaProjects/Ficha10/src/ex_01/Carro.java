package ex_01;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private double litros100km;

    // Constructor
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.litros100km = litros100km;
    }

    // Método ligar
    public String ligar(){
        if (this.ano<1993){
            if (this.combustivel.equals(TipoCombustivel.DIESEL)){
                return "Deita um pouco de fumo... Custa a pegar... O carro está ligado! Vrum-Vrum-Vrum";
            }else{
                return "Custa a pegar... O carro está ligado! Vrum-Vrum-Vrum";
            }
        }else{
            if (this.potencia<250){
                return "O carro está ligado! Vruummmmmmmmmmm";
            }else{
                return "O carro está ligado! VRUUMMMMMMM";
            }
        }
    }

    // Método corrida
    public Carro corrida(Carro carroAdversario){
        if (this.potencia>carroAdversario.potencia){
            return this;
        }else if (this.potencia<carroAdversario.potencia){
            return carroAdversario;
        }else{
            if (this.cilindrada>carroAdversario.cilindrada){
                return this;
            }else if (this.cilindrada<carroAdversario.cilindrada){
                return carroAdversario;
            }else{
                if (this.ano>carroAdversario.ano){
                    return this;
                }else if (this.ano<carroAdversario.ano){
                    return carroAdversario;
                }else{
                    return null;
                }
            }
        }
    }

    // Método calcular distancia valor em litros
    public double valorConsumido (double distancia){
         return ((this.litros100km/100)*distancia);
    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Potência: "+this.potencia);
        System.out.println("Cilindrada: "+this.cilindrada);
        System.out.println("TipoCombustível: "+this.combustivel);
        System.out.println("Litros/100km: "+this.litros100km);
    }
}
