package com.designpatterns.Employee;

import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class Shipper extends Employee{

    public ArrayList<Phone> shipList = new ArrayList<>();

    //@Override
    public void doSomething(Phone phone){
        phone = this.phone;
    }

    //@Override
    public void sendBack(Phone phone){

    }

    public void addToList(Phone phone){
        shipList.add(phone);
    }

    public ArrayList<Phone> getShipList() {
        return shipList;
    }

    public void setShipList(ArrayList<Phone> shipList) {
        this.shipList = shipList;
    }
}
