package ex_01;

public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel combustivel;
    private int litros100km;

    // Constructor
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel combustivel, int litros100km) {
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
        if (ano<1993){
            
        }
    }
}
