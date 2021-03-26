package com.designpatterns.Employee;

import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class Assembler extends Employee {
    public ArrayList<Phone> assembleList = new ArrayList<>();

    //@Override
    public  void doSomething(Phone phone){
        phone = this.phone;
    }

    //@Override
    public void sendBack(Phone phone){

    }

    public ArrayList<Phone> getAssembleList() {
        return assembleList;
    }

    public void setAssembleList(ArrayList<Phone> assembleList) {
        this.assembleList = assembleList;
    }


    @Override
    public void addToList(Phone phone){
        assembleList.add(phone);
    }
}
