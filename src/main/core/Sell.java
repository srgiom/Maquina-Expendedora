package main.core;

public interface Sell {
    final float[] values = {20.0f, 10.0f, 5.0f, 2.0f, 1.0f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
    public Wallet changueManagement(Wallet clientMoney, float productPrice);

    public Alerts jamMaybe();
    public Alerts failureMaybe();
}
