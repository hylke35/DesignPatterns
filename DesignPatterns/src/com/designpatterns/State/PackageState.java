package com.designpatterns.State;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;

public class PackageState implements PhoneState{
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
    public String process(Phone phone) {
        if (phone.getStatus() == Status.Assemble) {
            process = "The phone is currently being assembled";
        } else if (phone.getStatus() == Status.Package){
            process = "The phone is here";
        } else if (phone.getStatus() == Status.Ship){
            process = "The phone is currently being prepared for shipping";
        } else if (phone.getStatus() == Status.Shipped){
            process = "The phone is currently has been shipped";
        } else if (phone.getStatus() == Status.Sold){
            process = "The phone has been sold";
        }
        return process;
    }

    @Override
    public Status getState(Phone phone) {
        return phone.getStatus();
    }

    @Override
    public void setState(Phone phone) {
        phone.setStatus(Status.Package);
    }

}
