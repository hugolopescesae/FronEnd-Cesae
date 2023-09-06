package ex_01;

public class Main {
    public static void main(String[] args) {
        // Instanciar Carros
        Carro carro1 = new Carro("Ford","Focus",2003,250,1999,TipoCombustivel.DIESEL,5.6);
        Carro carro2 = new Carro("BMW","M4",1967,200,2299,TipoCombustivel.GASOLINA,8);

        // Métodos ligar
        System.out.println("Carro 1: "+carro1.ligar());
        System.out.println("Carro 2: "+carro2.ligar());

        // Fazer corrida
        if (carro1.corrida(carro2) == null){
            System.out.println("Empate");
        }else{
            System.out.println("Carro Vencedor:");
            Carro vencedor = carro1.corrida(carro2);
            vencedor.exibirDetalhes();
        }

        // Calcular valor do consumo em litros por 97km
        System.out.println("Carro 1: "+carro1.valorConsumido(97));
        System.out.println("Carro 2: "+carro2.valorConsumido(97));
    }
}
