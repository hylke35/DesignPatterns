package com.designpatterns.Builder;

public interface Builder {
    void reset();
    void addFrame();
    void addLogicboard();
    void addCam();
    void addBattery();
    void addScreen();
}
