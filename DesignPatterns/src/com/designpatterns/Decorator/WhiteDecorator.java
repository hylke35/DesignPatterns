package com.designpatterns.Decorator;

import com.designpatterns.Enum.Colour;
import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class WhiteDecorator extends PhoneDecorator {
    private ArrayList<Phone> WhiteDecoratorList = new ArrayList<>();


    public void addToList(Phone phone){
        WhiteDecoratorList.add(phone);
    }

    @Override
    public void decorate() {
        for (Phone phone : WhiteDecoratorList){
            setPhoneColourWhite(phone);
        }
    }

    public void setPhoneColourWhite(Phone phone){
        phone.decorate(Colour.White);
    }

}
