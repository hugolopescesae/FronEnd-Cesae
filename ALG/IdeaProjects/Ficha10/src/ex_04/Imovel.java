package ex_04;

public class Imovel {
    // Atributos
    private String rua;
    private int numPorta;
    private String cidade;
    private tipoCasa tipoCasa;
    private acabamento acabamento;
    private int area;
    private int numQuartos;
    private int numCasaDeBanho;
    private int areaPiscina;

    // Constructor
    public Imovel(String rua, int numPorta, String cidade, tipoCasa tipoCasa, ex_04.acabamento acabamento, int area, int numQuartos, int numCasaDeBanho, int areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoCasa = tipoCasa;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numCasaDeBanho = numCasaDeBanho;
        this.areaPiscina = areaPiscina;
    }

    // Método para calcular o valor do imóvel
    public double calcularValorImovel(){
        switch (this.tipoCasa){
            case APARTAMENTO:
                if (this.acabamento.equals(ex_04.acabamento.PARARESTAURO)){
                    return (((this.area*1000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*0.50);
                }else if (this.acabamento.equals(ex_04.acabamento.USADA)){
                    return (((this.area*1000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*0.90);
                }else if (this.acabamento.equals(ex_04.acabamento.NOVA)){
                    return ((this.area*1000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000));
                }else{
                    return (((this.area*1000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*1.25);
                }
            case CASA:
                if (this.acabamento.equals(ex_04.acabamento.PARARESTAURO)){
                    return (((this.area*3000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*0.50);
                }else if (this.acabamento.equals(ex_04.acabamento.USADA)){
                    return (((this.area*3000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*0.90);
                }else if (this.acabamento.equals(ex_04.acabamento.NOVA)){
                    return ((this.area*3000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000));
                }else{
                    return (((this.area*3000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*1.25);
                }
            case MANSÃO:
                if (this.acabamento.equals(ex_04.acabamento.PARARESTAURO)){
                    return (((this.area*5000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*0.50);
                }else if (this.acabamento.equals(ex_04.acabamento.USADA)){
                    return (((this.area*5000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*0.90);
                }else if (this.acabamento.equals(ex_04.acabamento.NOVA)){
                    return ((this.area*5000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000));
                }else{
                    return (((this.area*5000)+(this.numQuartos*7500)+(this.numCasaDeBanho*10500)+(this.areaPiscina*1000))*1.25);
                }
        }
        return 0;
    }

    // Método para mudar o estado de uma casa
    public String mudarEstadoCasa(tipoCasa casaInserida){
        if (casaInserida.equals(ex_04.tipoCasa.CASA) & !casaInserida.equals(this.tipoCasa)){
            this.tipoCasa.equals(ex_04.tipoCasa.CASA);
            return "Tipo de Imovél mudada com sucesso!";
        }else if (casaInserida.equals(ex_04.tipoCasa.APARTAMENTO) & !casaInserida.equals(this.tipoCasa)){
            this.tipoCasa.equals(ex_04.tipoCasa.APARTAMENTO);
            return "Tipo de Imovél mudada com sucesso!";
        }else if (casaInserida.equals(ex_04.tipoCasa.MANSÃO) & !casaInserida.equals(this.tipoCasa)){
            this.tipoCasa.equals(ex_04.tipoCasa.MANSÃO);
            return "Tipo de Imovél mudada com sucesso!";
        }else{
            return "O imovél já possuí esse tipo de estado!";
        }
    }

    // Método exibir detalhes da casa
    public void imprimirDescricao(){
        System.out.println("Descrição do Imovél: ");
        System.out.println("Rua: "+this.rua);
        System.out.println("Número de Porta: "+this.numPorta);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Tipo de Imovél: "+this.tipoCasa);
        System.out.println("");
    }
}
