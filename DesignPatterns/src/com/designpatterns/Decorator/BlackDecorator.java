package com.designpatterns.Decorator;

import com.designpatterns.Employee.Packager;
import com.designpatterns.Enum.Colour;
import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class BlackDecorator extends PhoneDecorator {
    private ArrayList<Phone> blackDecoratorList = new ArrayList<>();
    private Packager packager;

    public BlackDecorator(Packager packager) {
        this.packager = packager;
    }

    public void addToBlackDecoratorList(Phone phone){
        blackDecoratorList.add(phone);
    }

    public void printBlackDecoratorList(){
        for (Phone phone : blackDecoratorList){
            System.out.println(phone.getModel());
        }
    }

    @Override
    public void decorate() {
        ArrayList<Phone> decoratedPhoneList = new ArrayList<>();
        for (Phone phone : blackDecoratorList){
            decoratedPhoneList.add(phone);
            setPhoneColourBlack(phone);
            packager.addToList(phone);
        }
        blackDecoratorList.removeAll(decoratedPhoneList);
    }

    public void setPhoneColourBlack(Phone phone){
        phone.decorate(Colour.Black);
        phone.setResult();
    }

}
