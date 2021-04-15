package com.designpatterns.Builder;

public class MiniBuilder extends PhoneBuilder {

    @Override
    public void buildFrame() {
        phone.setFrame("Mini Frame");
    }

    @Override
    public void buildLogicboard() {
        phone.setLogicboard("AX10");
    }

    @Override
    public void buildCam() {
        phone.setCam("10MP");
    }

    @Override
    public void buildBattery() {
        phone.setBattery("3600mAH");
    }

    @Override
    public void buildScreen() {
        phone.setScreen("5 inch");
    }
}
