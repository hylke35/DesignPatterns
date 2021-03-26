package com.designpatterns.Builder;

import com.designpatterns.Builder.Builder;
import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.PhoneUltra;

public class UltraBuilder implements Builder {
    private PhoneUltra phoneUltra;

    public UltraBuilder() {
        reset();
    }

    public PhoneUltra getPhoneUltra() {
        return phoneUltra;
    }

    public void setPhoneUltra(PhoneUltra phoneUltra) {
        this.phoneUltra = phoneUltra;
    }

    @Override
    public void reset() {
        this.phoneUltra = new PhoneUltra();
    }

    @Override
    public void addFrame() {
        phoneUltra.setFrame("Ultra Frame");
    }

    @Override
    public void addLogicboard() {
        phoneUltra.setLogicboard("AX12X");
    }

    @Override
    public void addCam() {
        phoneUltra.setCam("40MP");
    }

    @Override
    public void addBattery() {
        phoneUltra.setBattery("4600mAH");
    }

    @Override
    public void addScreen() {
        phoneUltra.setScreen("7 inch");
    }

    public void build() {
        addFrame();
        addLogicboard();
        addCam();
        addBattery();
        addScreen();
        phoneUltra.setResult();
        phoneUltra.setStatus(Status.Assemble);
    }

}
