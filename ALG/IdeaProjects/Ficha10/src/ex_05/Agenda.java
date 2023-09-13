package ex_05;

public class Agenda {
    // Array guardar pessoas e variaveis
    Pessoa [] arrayPessoas;
    private int counter = 0;

    // Contructor
    public Agenda() {
        arrayPessoas = new Pessoa[50];
    }

    // Adicionar pessoa ao arrayPessoas
    public String guardarPessoas(Pessoa pessoa) {
        arrayPessoas[this.counter++] = pessoa;
        return "Pessoa adicionada com sucesso!";
    }

    // Mostrar pessoas do array pessoas
    public void mostrarPessoas() {
        for (int i = 0;i < counter;i++){
            arrayPessoas[i].exibirDetalhes();
        }
    }

}
