package ex_08;

public class Main {
    public static void main(String[] args) {
        // Instanciar Aluno
        Aluno aluno1 = new Aluno("Hugo",19,"Front-end Developer",10);

        // Chamar método situacao
        System.out.println(aluno1.situacao());
    }
}
