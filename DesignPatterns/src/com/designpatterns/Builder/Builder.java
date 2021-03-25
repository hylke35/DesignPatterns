package com.designpatterns.Builder;

public interface Builder {
    void reset();
    boolean addFrame();
    boolean addLogicboard();
    boolean addCam();
    boolean addCamTwo();
    boolean addBattery();
    boolean addScreen();
}
