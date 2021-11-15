package com.money;

public class Rupee {
    private double monetaryValue;

    public Rupee(double monetaryValue){
        this.monetaryValue = monetaryValue;
    }

    @Override
    public boolean equals(Object object) {
        Rupee rupee = (Rupee) object;
        return this.monetaryValue == rupee.monetaryValue;
    }

   public Rupee addingMonetaryValue(Rupee rupee) {
       Rupee addedMonetaryValue = new Rupee(this.monetaryValue + rupee.monetaryValue);
       return addedMonetaryValue;
    }
}
