package ex_04;

public class Main {
    public static void main(String[] args) {
        // Instanciar Imovél
        Imovel imovel1 = new Imovel("Rua Ator Mário Viegas",50,"Porto",tipoCasa.APARTAMENTO,acabamento.NOVA,100,5,3,0);
        Imovel imovel2 = new Imovel("Rua da Boavista",30,"Porto",tipoCasa.CASA,acabamento.USADA,55,2,3,2);

        // Método para mudar o estado da casa
        imovel1.mudarEstadoCasa(tipoCasa.MANSÃO);
        imovel2.mudarEstadoCasa(tipoCasa.APARTAMENTO);

        // Método imprimarDescricao
        imovel1.imprimirDescricao();
        System.out.println("\n");
        imovel2.imprimirDescricao();
        System.out.println("\n");

        // Método compararImoveis
        Imovel imovelCaro1 = imovel1.compararImoveis(imovel2);
        imovelCaro1.imprimirDescricao();
        System.out.println("\n");
        Imovel imovelCaro2 = imovel2.compararImoveis(imovel1);
        imovelCaro2.imprimirDescricao();
        System.out.println("\n");
    }
}
