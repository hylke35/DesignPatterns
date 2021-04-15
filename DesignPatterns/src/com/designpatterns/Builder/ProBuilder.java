package com.designpatterns.Builder;

import com.designpatterns.Enum.Status;

public class ProBuilder extends PhoneBuilder {

    @Override
    public void buildFrame() {
        phone.setFrame("Pro Frame");
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
