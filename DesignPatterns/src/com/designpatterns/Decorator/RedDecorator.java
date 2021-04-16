package com.designpatterns.Decorator;

import com.designpatterns.Phone.Phone;

public class RedDecorator extends PhoneDecorator {

    public RedDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public String decorate() {
        return decorateWithRed() + super.decorate();
    }

    public String decorateWithRed(){
        return "Red ";
    }
}
