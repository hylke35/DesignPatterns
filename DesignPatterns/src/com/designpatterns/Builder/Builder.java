package com.designpatterns.Builder;

public interface Builder {
    void reset();
    boolean addFrame();
    void addLogicboard();
    void addCam();
    void addCamTwo();
    void addBattery();
    void addScreen();
}
