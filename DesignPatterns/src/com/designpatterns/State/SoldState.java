package com.designpatterns.State;

import com.designpatterns.Phone.Phone;

public class SoldState implements PhoneState{
    @Override
    public void next(Phone phone) {
        printStatus();
    }

    @Override
    public void prev(Phone phone) {
        phone.setStatus(new StoreState());
    }

    @Override
    public void printStatus() {
        System.out.println("The Phone has been sold.");
    }
}
