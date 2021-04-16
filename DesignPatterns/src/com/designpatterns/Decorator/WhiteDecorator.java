package com.designpatterns.Decorator;

import com.designpatterns.Phone.Phone;

public class WhiteDecorator extends PhoneDecorator {

    public WhiteDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public String decorate() {
        return decorateWithWhite() + super.decorate();
    }

    public String decorateWithWhite(){
        return "White ";
    }
}
