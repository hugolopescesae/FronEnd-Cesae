package ex_02;

public class Camiao extends Veiculo{
    // Atributos
    private int capacidadeCarga;

    // Método Constructor
    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km, int capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Verificar peso da carga
    public boolean verificarPeso(int peso) {
        if (peso<capacidadeCarga){
            return true;
        }
        return false;
    }

    // Método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade Passageiros: "+this.capacidadeCarga);
    }

    // Método Viagem
    public void Viagem(int peso, int distancia) {
        if (!verificarPeso(peso)){

        }
    }
}
