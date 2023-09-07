package ex_05;

public class Agenda {
    // Instanciar array
    String[] arrayPessoas = new String[3];
    int counter = 0;

    // Método para adicionar pessoas a um array
    public String guardarPessoas(){
        arrayPessoas[counter] =
        counter++;
        return "Pessoa adicionada com sucesso!";
    }

    // Método imprimirPessoas
    public void imprimirPessoas(){
        for (int i = 0;i < arrayPessoas.length;i++){
            System.out.println(arrayPessoas[i]);
        }
    }
}
