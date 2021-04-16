package com.designpatterns.State;

import com.designpatterns.Phone.Phone;

public class StoreState implements PhoneState{


    @Override
    public void next(Phone phone) {
        phone.setStatus(new SoldState());
    }

    @Override
    public void prev(Phone phone) {
        phone.setStatus(new ShipState());
    }

    @Override
    public void printStatus() {
        System.out.println("The Phone is currently in the store.");
    }

    public void setStoreState(Phone phone){
        phone.setStatus(this);
    }
}
