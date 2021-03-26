package com.designpatterns;

import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Enum.Colour;
import com.designpatterns.Enum.PhoneName;

public class Main {

    public static void main(String[] args) {
        PhoneBuilder test = new PhoneBuilder();
        test.buildPhone(PhoneName.PhoneUltra);
        test.getPhone().setColour(Colour.White);
        test.getPhone().
        //System.out.println(test.getPhone().getColour());
        //WhiteDecorater white = new WhiteDecorater(test.getPhone());
        //System.out.println(white.getDecoratedPhone());
        //white.decorate();
        System.out.println(test.getPhone().getResult());
    }
}
