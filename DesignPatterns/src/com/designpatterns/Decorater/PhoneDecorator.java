package com.designpatterns.Decorater;

import com.designpatterns.Phone;

public abstract class PhoneDecorator implements Phone {
    protected Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }

    public void decorate() {
        decoratedPhone.decorate();
    }
}
