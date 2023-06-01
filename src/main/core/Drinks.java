package main.core;

public class Drinks extends Product implements Sell{

    private double mililiters;

    public Drinks(double price, String name, int id, int quantity) {
        super(price, name, id, quantity);
        this.mililiters = 330;
    }


    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void replanishStock(int elements) {

    }

    @Override
    public void upPrice(int percentage) {

    }
}
