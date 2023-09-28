package ex_02;

import java.util.Scanner;

public class Mota extends Veiculo{
    // Método Constructor
    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double litros100km) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);
    }

    // Ler ficheiro Mota.txt
    Scanner scanner = new Scanner("Mota.txt");

    // Imprimir ficheiro
    public void imprimirFicheiro(){
        while (scanner.hasNextLine()){
            System.out.println(scanner.next());
        }
    }
}