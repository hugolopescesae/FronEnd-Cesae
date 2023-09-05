package ex_11;

public class Conta {
    // Atributos
    private int numConta;
    private double saldo;
    private String titular;

    // Constructor
    public Conta(int numConta, double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Método Depositar
    public String depositar(double valor){
        this.saldo += valor;
        return "Deposito com sucesso!";
    }

    // Método Levantar
    public String levantar(double valor){
        if (valor>this.saldo){
            return "Valor indisponivel para levantar!";
        }else{
            this.saldo -= valor;
            return "Levantamento com sucesso!";
        }
    }

    // Método Transferência
    public void transferencia(double valor, Conta contaDestino){
        if (valor>saldo){
            System.out.println("Transferência falhada!");
        }else{
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência com sucesso!");
        }
    }

    // Método Mostrar Saldo
    public double mostrarSaldo(){
        return this.saldo;
    }
}
