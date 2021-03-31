package com.designpatterns.Decorator;

import com.designpatterns.Employee.Assembler;
import com.designpatterns.Employee.Packager;
import com.designpatterns.Enum.Colour;
import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class WhiteDecorator extends PhoneDecorator {
    private ArrayList<Phone> whiteDecoratorList = new ArrayList<>();
    private Packager packager;

    public WhiteDecorator(Packager packager) {
        this.packager = packager;
    }

    public void addToWhiteDecoratorList(Phone phone){
        whiteDecoratorList.add(phone);
    }

    public void printWhiteDecoratorList(){
        for (Phone phone : whiteDecoratorList){
            System.out.println(phone.getModel());
        }
    }

    @Override
    public void decorate() {
        ArrayList<Phone> decoratedPhoneList = new ArrayList<>();
        for (Phone phone : whiteDecoratorList){
            setPhoneColourWhite(phone);
            setPhoneColourWhite(phone);
        }
        whiteDecoratorList.removeAll(decoratedPhoneList);
    }

    public void setPhoneColourWhite(Phone phone){
        phone.decorate(Colour.White);
        phone.setResult();
    }

}
