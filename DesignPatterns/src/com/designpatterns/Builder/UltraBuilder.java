package com.designpatterns.Builder;


import com.designpatterns.Enum.PhoneName;

public class UltraBuilder extends PhoneBuilder {
    @Override
    public void buildFrame() {
        phone.setFrame("Ultra Frame");
        phone.setModel(PhoneName.PhoneUltra);
    }

    @Override
    public void buildLogicboard() {
        phone.setLogicboard("AX12X");
    }

    @Override
    public void buildCam() {
        phone.setCam("40MP");
    }

    @Override
    public void buildBattery() {
        phone.setBattery("4600mAH");
    }

    @Override
    public void buildScreen() {
        phone.setScreen("7 inch");
    }

}
