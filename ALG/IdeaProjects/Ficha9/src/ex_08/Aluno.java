package ex_08;

public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private String curso;
    private double media;

    // Constructor
    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    // Método situacao
    public String situacao(){
        if (media>=9.5){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
}
