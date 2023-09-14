package ex_01;

public class Bicycle {
    // Atributos
    private int id;
    private int numberOfGears;
    private String mainColor;
    private int wellSize;
    private int bikeLength;
    private boolean adjustableSeatpost;
    private double price;

    // Constructor
    public Bicycle(int id, int numberOfGears, String mainColor, int wellSize, int bikeLength, boolean adjustableSeatpost, double price) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wellSize = wellSize;
        this.bikeLength = bikeLength;
        this.adjustableSeatpost = adjustableSeatpost;
        this.price = price;
    }


}
