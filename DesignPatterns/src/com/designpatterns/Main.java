package com.designpatterns;

import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Enum.PhoneName;

public class Main {

    public static void main(String[] args) {
        PhoneBuilder test = new PhoneBuilder();
        test.buildPhone(PhoneName.PhoneMINI);
        test.getMiniBuilder().addFrame();
        System.out.println(test.getPhone().getFrame());
    }
}
