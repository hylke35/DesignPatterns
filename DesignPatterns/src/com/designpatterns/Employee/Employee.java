package com.designpatterns.Employee;

import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public abstract class Employee{

    protected Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void addToList(){

    }
}

