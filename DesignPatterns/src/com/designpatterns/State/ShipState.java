package com.designpatterns.State;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;

public class ShipState implements PhoneState{
    private String process;
    private Phone phone;

    @Override
    public Phone getPhone() {
        return phone;
    }

    @Override
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String process() {
        return process;
    }

    @Override
    public Status getState(Phone phone) {
        return phone.getStatus();
    }

    @Override
    public void setState(Phone phone) {
        phone.setStatus(Status.Ship);
    }
}
