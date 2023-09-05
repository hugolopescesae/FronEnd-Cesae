package ex_10;

public class Main {
    public static void main(String[] args) {
        // Instanciar funcionário
        Funcionário funcionario1 = new Funcionário("Hugo",1500,"Front-end Developer");

        // Método aumentar salário em 10%
        funcionario1.aumentarSalario(0.10);

        // Método exibir dados
        funcionario1.exibirDados();
    }
}
