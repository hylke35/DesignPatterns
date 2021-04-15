package com.designpatterns.Builder;

import com.designpatterns.Phone.Phone;


public abstract class PhoneBuilder {
    protected Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void createNewPhone() {
        phone = new Phone();
    }

    public abstract void buildFrame();
    public abstract void buildLogicboard();
    public abstract void buildCam();
    public abstract void buildBattery();
    public abstract void buildScreen();
}
