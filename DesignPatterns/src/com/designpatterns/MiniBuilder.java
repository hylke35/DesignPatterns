package com.designpatterns;

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
    public void addFrame() {
        this.phoneMini.addPart();
    }

    @Override
    public void addLogicboard() {
        this.phoneMini.addPart();
    }

    @Override
    public void addBattery() {
        this.phoneMini.addPart();

    }

    @Override
    public void addScreen() {
        this.phoneMini.addPart();

    }

    public PhoneMini build() {
        return this.phoneMini;
    }


}
