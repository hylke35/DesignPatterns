package com.designpatterns.Employee;

import com.designpatterns.Enum.Status;
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
        shipList.remove(phone);
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

    public String Process(Phone phone){
        String process = null;
        if(phone.getStatus() == Status.Ship ){
            process = "the phone has been shiped";
        }
        return process;
    }
}
