package com.designpatterns;

import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class Assembler extends Employee {
    public Assembler(Phone phone) {
        super(phone);
    }

    public ArrayList<Phone> shipList = null;

    //@Override
    public void doSomething(Phone phone){
        phone = this.phone;
    }

    //@Override
    public void sendBack(Phone phone){

    }
}
