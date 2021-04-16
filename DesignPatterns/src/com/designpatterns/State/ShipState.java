package com.designpatterns.State;

import com.designpatterns.Phone.Phone;

public class ShipState implements PhoneState{

    @Override
    public void next(Phone phone) {
        phone.setStatus(new StoreState());
    }

    @Override
    public void prev(Phone phone) {
        phone.setStatus(new AssembleState());
    }

    @Override
    public void printStatus() {
        System.out.println("Phone currently being shipped to the store.");
    }
}
