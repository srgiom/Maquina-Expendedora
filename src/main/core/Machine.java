package main.core;

import java.util.ArrayList;
import java.util.Random;
    public class Machine implements Sell{
        private int id;
        private ArrayList<Product> products;
        private Wallet money;
        private Alerts alert;
    }

    public Machine(int id){
        this.id=id;
        this.alerts=Alerts.normal;
        this.products=new ArrayList<>();
    }

    public int getID(){
        return this.id;
    }

    public Wallet getMoney(){
        return this.money;
    }

    public void setMoney(Wallet money){
        this.money=money;
    }

    public Alerts getAlert(){
        return this.alert;
    }

    public void productsList(){
        for(Product p:this.products){
            System.out.println(p.getName()+" "+p.getPrice()+" "+p.getUnits());
        }
    }

    public Wallet buyProduct(Wallet clientMoney, int productID) throws JamException, FailureException{

    }

    public Wallet changueManagement(Wallet clientMoney, float price){
        Wallet changue = new Wallet();
        float total = clientMoney.getTotal();
        float changueAmount = 0;

        int resto = 1;
        if(total>productPrice){
            changueAmount = (int)(total - productPrice)*100;

            for(float val:Sell.values){
                int coins=(int)(val*100);
                if(changueAmount>=coins && Wallet.getQuantity(val)>0){
                    changue = changueAmount%coins;
                    changueAmount.put(val, changueAmount/coins);
                    changueAmount = changue;
                }
            }
        }
        if(changueAmount>0){
            return null;
        } else{
            return changue;
        }
    }

    @Override
    public Alerts jamMaybe(){
        Random r = new Random();
        if(r.nextInt(100)<2){
            return Alerts.jam;
        }else{
            return Alerts.normal;
        }
    }

    @Override
    public Alerts failureMaybe(){
        Random r = new Random();
        if(r.nextInt(100)<3){
            return Alerts.failure;
        }else{
            return Alerts.normal;
        }
    }

    public float getProductPrice(int id){
        for(Product p:this.products){
            if(p.getId()==id){
                return p.getPrice();
            }
        }
        return -1;
    }
}