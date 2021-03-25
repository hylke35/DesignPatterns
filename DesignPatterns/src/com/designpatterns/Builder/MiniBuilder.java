package com.designpatterns.Builder;

public class MiniBuilder implements Builder {
    private PhoneMini phoneMini;

    public MiniBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.phoneMini = new PhoneMini();
    }

    @Override
    public boolean addFrame() {
        return false;
    }

    @Override
    public boolean addLogicboard() {
        return false;
    }

    @Override
    public boolean addCam() {
        return false;
    }

    @Override
    public boolean addCamTwo() {
        return false;
    }

    @Override
    public boolean addBattery() {
        return false;
    }

    @Override
    public boolean addScreen() {
        return false;
    }


    public PhoneMini build() {
        return this.phoneMini;
    }


}
