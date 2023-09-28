package ex_02;

public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litros100km;

    // Constructor
    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100km = litros100km;
    }

    // Método ligar
    public void ligar() {
        if (this.anoFabrico<1993){
            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado! Vrum-Vrum-Vrum");
            }else if (this.tipoCombustivel.equals(TipoCombustivel.GASOLINA)){
                System.out.println("Custa a pegar... O carro está ligado! Vrum-Vrum-Vrum");
            }else if (this.tipoCombustivel.equals(TipoCombustivel.GPL)){
                System.out.println("Custa a pegar... O carro está ligado!");
            }else{
                System.out.println("O carro está ligado! Vrum-Vrum-Vrum");
            }
        }else{
            if (this.potencia<250){
                System.out.println("O carro está ligado! Vruummmmmmmmmmm");
            }else{
                System.out.println("O carro está ligado! VRUUMMMMMMM");
            }
        }
    }

    // Método corrida
    public Veiculo corrida(Veiculo veiculoAdeversario){
        if (this.potencia>veiculoAdeversario.potencia){
            return this;
        }else if (this.potencia<veiculoAdeversario.potencia){
            return veiculoAdeversario;
        }else{
            if (this.cilindrada>veiculoAdeversario.cilindrada){
                return this;
            }else if (this.cilindrada<veiculoAdeversario.cilindrada){
                return veiculoAdeversario;
            }else{
                if (this.anoFabrico>veiculoAdeversario.anoFabrico){
                    return this;
                }else if (this.anoFabrico<veiculoAdeversario.anoFabrico){
                    return veiculoAdeversario;
                }else{
                    return null;
                }
            }
        }
    }

    // Método calcularConsumo
    public double calcularConsumo (double distancia){
        if (this.tipoCombustivel.equals(TipoCombustivel.GASOLINA)){
            return (((this.litros100km/100)*distancia)*2.10);
        }else if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
            return (((this.litros100km/100)*distancia)*1.95);
        }else if (this.tipoCombustivel.equals(TipoCombustivel.GPL)){
            return (((this.litros100km/100)*distancia)*1.15);
        }else{
            return (((this.litros100km/100)*distancia)*0.12);
        }
    }

    // Método exibirDetalhes
    public void exibirDetalhes() {
        System.out.println("Detalhes Véiculo:");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de Fabrico: "+this.anoFabrico);
        System.out.println("Potência: "+this.potencia);
        System.out.println("Cilindrada: "+this.cilindrada);
        System.out.println("Tipo de Combustivel: "+this.tipoCombustivel);
        System.out.println("Litros 100km: "+this.litros100km);
    }
}
