package com.designpatterns.Builder;

public interface Builder {
    void reset();
    String addFrame();
    String addLogicboard();
    String addCam();
    String addCamTwo();
    String addBattery();
    String addScreen();
}
