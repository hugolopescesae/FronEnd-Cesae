package ex_02;

public class Carro extends Veiculo{
    // Atributos
    private int quantPassageiros;

    // Método constructor
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km, int quantPassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);
        this.quantPassageiros = quantPassageiros;
    }

    // Método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade Passageiros: "+this.quantPassageiros);
    }

}
