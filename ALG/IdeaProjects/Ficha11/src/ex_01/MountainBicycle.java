package ex_01;

import java.util.ArrayList;

public class MountainBicycle extends Bicycle{
    // Atributos
    private int numberOfLigths;
    private Suspension suspensionType;
    private ArrayList<String> bikeTools;

    // Constructor

    public MountainBicycle(int id, int numberOfGears, String mainColor, int wellSize, int bikeLength, boolean adjustableSeatpost, double price, int numberOfLigths, Suspension suspensionType, ArrayList<String> bikeTools) {
        super(id, numberOfGears, mainColor, wellSize, bikeLength, adjustableSeatpost, price);
        this.numberOfLigths = numberOfLigths;
        this.suspensionType = suspensionType;
        this.bikeTools = bikeTools;
    }
}
