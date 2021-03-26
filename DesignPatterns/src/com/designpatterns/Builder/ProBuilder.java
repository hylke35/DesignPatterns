package com.designpatterns.Builder;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.PhonePro;

public class ProBuilder implements Builder {
    private PhonePro phonePro;

    public ProBuilder() {
        reset();
    }

    public PhonePro getPhonePro() {
        return phonePro;
    }

    public void setPhonePro(PhonePro phonePro) {
        this.phonePro = phonePro;
    }

    @Override
    public void reset() {
        this.phonePro = new PhonePro();
    }

    @Override
    public void addFrame() {
        phonePro.setFrame("Pro Frame");
    }

    @Override
    public void addLogicboard() {
        phonePro.setLogicboard("AX10+");
    }

    @Override
    public void addCam() {
        phonePro.setCam("25MP");
    }

    @Override
    public void addBattery() {
        phonePro.setBattery("4200mAH");
    }

    @Override
    public void addScreen() {
        phonePro.setScreen("6.2 inch");
    }

    public void build() {
        addFrame();
        addLogicboard();
        addCam();
        addBattery();
        addScreen();
        phonePro.setResult();
        phonePro.setStatus(Status.Assemble);
    }

}
