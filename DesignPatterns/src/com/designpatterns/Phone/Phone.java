package com.designpatterns.Phone;

import com.designpatterns.Enum.Colour;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;

public abstract class Phone {
    private Colour colour;
    protected PhoneName model;
    private String frame;
    private String logicboard;
    private String battery;
    private String cam;
    private String screen;
    private String result;
    private Status status;

    public Phone(PhoneName model) {
        this.model = model;
    }

    public Colour getColour() {
        return colour;
    }

    public void decorate(Colour colour) {
        this.colour = colour;
    }

    public PhoneName getModel() {
        return model;
    }

    public void setModel(PhoneName model) {
        this.model = model;
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

    public void setResult() {
        result = "Model: " + getModel() +"\n"+
                 "Frame: " + getFrame() +"\n"+
                 "Logicboard: " + getLogicboard() +"\n"+
                 "Battery: " + getBattery() +"\n"+
                 "Camera: " + getCam() +"\n"+
                 "Screen: " + getScreen() +"\n"+
                 "Colour: " + getColour();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
