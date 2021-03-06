package com.designpatterns.State;

import com.designpatterns.Phone.Phone;

public class AssembleState implements PhoneState{

    @Override
    public void next(Phone phone) {
        phone.setStatus(new ShipState());
    }

    @Override
    public void prev(Phone phone) {
        phone = null;
        System.out.println("The phone was destroyed.");
    }

    @Override
    public void printStatus() {
        System.out.println("Phone is in the assembly line.");
    }
}
