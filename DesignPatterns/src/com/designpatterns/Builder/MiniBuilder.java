package com.designpatterns.Builder;

import com.designpatterns.PhoneMini;

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
    public String addFrame() {
        return "Mini Frame";
    }

    @Override
    public String addLogicboard() {
        return "AX10";
    }

    @Override
    public String addCam() {
        return "10MP";
    }

    @Override
    public String addCamTwo() {
        return null;
    }

    @Override
    public String addBattery() {
        return "3600mAH";
    }

    @Override
    public String addScreen() {
        return "5 inch";
    }
}
