package com.designpatterns.Phone;

import com.designpatterns.Decorator.Decorator;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.State.AssembleState;
import com.designpatterns.State.PhoneState;

public class Phone implements Decorator {
    protected PhoneName model;
    private String frame;
    private String logicboard;
    private String battery;
    private String cam;
    private String screen;
    private String result;
    private PhoneState phoneState = new AssembleState();

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
                 "Screen: " + getScreen() +"\n";
    }

    public PhoneState getStatus() {
        return phoneState;
    }

    public void setStatus(PhoneState phoneState) {
        this.phoneState = phoneState;
    }

    @Override
    public String decorate() {
        String phoneString = "Phone";

        if(this.getFrame() == "Mini Frame"){
            phoneString = "Mini Phone";
        } else if(this.getFrame() == "Pro Frame"){
            phoneString = "Pro Phone";
        } else if(this.getFrame() == "Ultra Frame"){
            phoneString = "Ultra Phone";
        }

        return phoneString;
    }

}
