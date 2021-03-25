package com.designpatterns.Decorator;

import com.designpatterns.Enum.Colour;
import com.designpatterns.Phone.Phone;

public class WhiteDecorater extends PhoneDecorator {
    public WhiteDecorater(Phone decoratedPhone) {
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
