package m3.mock;

public class Vehicle {
    private String brand;
    private int id;
    private Dealer dealer;
    private double price;

    public Dealer getDealer() {
        return dealer;
    }


    public String getBrand() {
        return this.brand;
    }


    public int getId() {
        return id;
    }


	public double getPrice() {
		return price;
	}
}
