package com.designpatterns;

import com.designpatterns.Phone.Phone;

public abstract class Employee {

public com.designpatterns.Phone.Phone phone;

    public Employee(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void doSomething(Phone phone){
        phone = this.phone;
    }

    public void sendBack(){

    }
}

