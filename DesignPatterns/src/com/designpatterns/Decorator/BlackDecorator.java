package com.designpatterns.Decorator;

import com.designpatterns.Phone.Phone;

public class BlackDecorator extends PhoneDecorator {

    public BlackDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public String decorate() {
        return decorateWithBlack() + super.decorate();
    }

    public String decorateWithBlack(){
        return "Black ";
    }
}
