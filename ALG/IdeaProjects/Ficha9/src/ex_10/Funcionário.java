package ex_10;

public class Funcionário {
    // Atributos
    private String nome;
    private double salario;
    private String departamento;

    // Constructor
    public Funcionário(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método aumentarSalario
    public String aumentarSalario(double valor){
        this.salario += salario*valor;
        return "Salário aumentado!";
    }

    // Método exibirDados
    public void exibirDados(){
        System.out.println("Dados do Funcionário: ");
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
        System.out.println("Departamento: "+this.departamento);
    }
}
