package com.designpatterns;

import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class Packager extends Employee {
    public Packager(Phone phone) {
        super(phone);
    }
    public ArrayList<Phone> shipList = null;

    //@Override
    public void doSomething(Phone phone){
       
    }

    //@Override
    public void sendBack(Phone phone){

    }
}
