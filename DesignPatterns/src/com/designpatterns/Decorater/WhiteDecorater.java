package com.designpatterns.Decorater;

import com.designpatterns.Phone;

public class WhiteDecorater extends PhoneDecorator {
    public WhiteDecorater(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    @Override
    public void decorate() {
        decoratedPhone.decorate();
        setPhoneColourWhite(decoratedPhone);
    }

    private void setPhoneColourWhite(Phone decoratedPhone) {
        decoratedPhone
    }
}
