package ex_02;

public class Conta {
    // Atributos
    private int numConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo;
    private double valorDivida;

    // Constructor
    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Exibir detalhes da conta
    public void exibirDetalhes(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Ano de Abertura: "+this.anoAbertura);
        System.out.println("Número de Conta: "+this.numConta);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Valor em Dívida: "+this.valorDivida);
    }

    // Método pedirEmpréstimo
    public String pedirEmprestimo (double valor){
        if (this.valorDivida>0){
            return "Empréstimo falhado! Já possuí um empréstimo ativo!";
        }else{
            if (valor<(this.saldo*0.90)){
                this.saldo += valor;
                this.valorDivida = valor;
                return ("Empréstimo bem sucedido! O montante foi adicionado a sua conta!");
            }else{
                return ("Montante indísponivel para empréstimo!\nMontante disponível: "+(this.saldo*0.90));
            }
        }
    }
}
