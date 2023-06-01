package main.core;

public class Drinks extends Product implements Sell{

    private final double mililiters;

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

    @Override
    public Wallet changueManagement(Wallet clientMoney, float productPrice) {
        return null;
    }

    @Override
    public Alerts jamMaybe() {
        return null;
    }

    @Override
    public Alerts failureMaybe() {
        return null;
    }
}
