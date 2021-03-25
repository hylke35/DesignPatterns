package com.designpatterns.Decorator;

import com.designpatterns.Phone;

public abstract class PhoneDecorator implements Decorater {
    protected Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }

    @Override
    public void decorate() {
        decoratedPhone.decorate();
    }
}
