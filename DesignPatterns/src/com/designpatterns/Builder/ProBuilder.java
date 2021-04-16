package com.designpatterns.Builder;

import com.designpatterns.Enum.PhoneName;

public class ProBuilder extends PhoneBuilder {

    @Override
    public void buildFrame() {
        phone.setFrame("Pro Frame");
        phone.setModel(PhoneName.PhonePro);
    }

    @Override
    public void buildLogicboard() {
        phone.setLogicboard("AX10+");
    }

    @Override
    public void buildCam() {
        phone.setCam("25MP");
    }

    @Override
    public void buildBattery() {
        phone.setBattery("4200mAH");
    }

    @Override
    public void buildScreen() {
        phone.setScreen("6.2 inch");
    }
}
