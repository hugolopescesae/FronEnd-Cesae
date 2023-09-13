package ex_05;

public class Main {
    public static void main(String[] args) {
        // Instanciar Pessoas e agenda
        Pessoa pessoa1 = new Pessoa("Hugo",19,"hugolopes@gmail.com",912345678);
        Pessoa pessoa2 = new Pessoa("Manuel",54,"manuel@gmail.com",912345328);
        Agenda agenda1 = new Agenda();

        // Guardar pessoas
        agenda1.guardarPessoas(pessoa1);
        agenda1.guardarPessoas(pessoa2);

        // Mostrar Pessoas
        agenda1.mostrarPessoas();

    }
}
