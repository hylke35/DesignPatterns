package com.designpatterns.Decorator;

import com.designpatterns.Phone.Phone;

public abstract class PhoneDecorator implements Decorater {
    public Phone decoratedPhone;

    public Phone getDecoratedPhone() {
        return decoratedPhone;
    }

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }

    @Override
    public void decorate() {
        decoratedPhone.decorate();
    }


}
