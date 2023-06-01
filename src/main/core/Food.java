package main.core;

public abstract class Food extends Product implements Sell{

    private double grams;

    public Food(double price, String name, int id, int quantity) {
        super(price, name, id, quantity);
        this.grams = 150;
    }

}
