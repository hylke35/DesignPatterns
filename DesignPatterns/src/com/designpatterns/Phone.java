package com.designpatterns;

import com.designpatterns.Enum.Colour;
import com.designpatterns.Enum.Status;

public class Phone {
    private Colour colour;
    private String frame;
    private String logicboard;
    private String battery;
    private String cam;
    private String screen;
    private String result;
    private Status status;

    public void decorate() {
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getLogicboard() {
        return logicboard;
    }

    public void setLogicboard(String logicboard) {
        this.logicboard = logicboard;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getCam() {
        return cam;
    }

    public void setCam(String cam) {
        this.cam = cam;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
