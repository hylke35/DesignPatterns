package com.designpatterns.Decorator;

import com.designpatterns.Phone.Phone;

public abstract class PhoneDecorator implements Decorator {
    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String decorate() {
        return phone.decorate();
    }



}
