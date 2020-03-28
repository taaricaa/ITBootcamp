package banka_kod;

import java.util.Random;
import java.util.UUID;

public class Account {

    private String number;
    private String name;
    private Double amount;

    public Account(String name, String number){
        this.number=number;
        this.name=name;
        this.amount=1d;
    }

    public Account(String name){
        this(name,UUID.randomUUID().toString());
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",number,name,amount);
    }
}