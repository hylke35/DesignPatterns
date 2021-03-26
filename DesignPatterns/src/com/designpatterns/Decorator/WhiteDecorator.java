package com.designpatterns.Decorator;

import com.designpatterns.Enum.Colour;
import com.designpatterns.Phone.Phone;

public class WhiteDecorator extends PhoneDecorator {
    public WhiteDecorator(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    @Override
    public void decorate() {
        decoratedPhone.setColour(Colour.White);
    }

    private void setPhoneColourWhite(Phone decoratedPhone) {
        decoratedPhone.setColour(Colour.White);
    }

}
