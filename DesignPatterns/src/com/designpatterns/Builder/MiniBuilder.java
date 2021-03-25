package com.designpatterns.Builder;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.PhoneMini;

public class MiniBuilder implements Builder {
    private PhoneMini phoneMini;

    public MiniBuilder() {
        reset();
    }

    public PhoneMini getPhoneMini() {
        return phoneMini;
    }

    public void setPhoneMini(PhoneMini phoneMini) {
        this.phoneMini = phoneMini;
    }

    @Override
    public void reset() {
        this.phoneMini = new PhoneMini();
    }

    @Override
    public void addFrame() {
        phoneMini.setFrame("Mini Frame");
    }

    @Override
    public void addLogicboard() {
        phoneMini.setLogicboard("AX10");
    }

    @Override
    public void addCam() {
        phoneMini.setCam("10MP");
    }

    @Override
    public void addBattery() {
        phoneMini.setBattery("3600mAH");
    }

    @Override
    public void addScreen() {
        phoneMini.setScreen("5 inch");
    }

    public void build() {
        addFrame();
        addLogicboard();
        addCam();
        addBattery();
        addScreen();
        phoneMini.setResult();
        phoneMini.setStatus(Status.Assemble);
    }

}
