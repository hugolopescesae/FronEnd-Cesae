package ex_01;

public class BaggageBike extends Bicycle{
    // Atributos
    private boolean isFrontBasket;
    private int basketDelivery;
    private String[] sponsors;

    //


    public BaggageBike(int id, int numberOfGears, String mainColor, int wellSize, int bikeLength, boolean adjustableSeatpost, double price, boolean isFrontBasket, int basketDelivery, String[] sponsors) {
        super(id, numberOfGears, mainColor, wellSize, bikeLength, adjustableSeatpost, price);
        this.isFrontBasket = isFrontBasket;
        this.basketDelivery = basketDelivery;
        this.sponsors = sponsors;
    }
}
