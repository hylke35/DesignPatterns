package com.designpatterns.Employee;

import com.designpatterns.Phone.Phone;
import com.designpatterns.State.PhoneState;

import java.util.ArrayList;

public abstract class Employee implements PhoneState {

    protected Phone phone;
    protected String process;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void sendBack(){

    }

    public void addToList(Phone phone){

    }

    public void addListToList(ArrayList<Phone> phoneList){

    }

    public void printList(){

    }

    public void moveForward(){

    }

    public String Process(Phone phone){
        return process;
    }
}

