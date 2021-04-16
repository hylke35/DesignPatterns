package com.designpatterns.Employee;

import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Phone.Phone;
import com.designpatterns.State.AssembleState;
import com.designpatterns.State.ShipState;

import java.util.ArrayList;
import java.util.Iterator;

public class Assembler extends Employee {
    private AssembleState assembleState = new AssembleState();
    private ArrayList<Phone> defectiveList = new ArrayList<>();
    private PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public Phone getPhone() {
        return phoneBuilder.getPhone();
    }

    public void assemblePhone() {
        phoneBuilder.createNewPhone();
        phoneBuilder.buildBattery();
        phoneBuilder.buildCam();
        phoneBuilder.buildFrame();
        phoneBuilder.buildScreen();
        phoneBuilder.buildLogicboard();
    }

    public void sendToShipper(Shipper shipper){
        Phone phone = this.getPhone();
        shipper.addToList(phone);
    }

    public void destroyPhone(Phone phone){
        assembleState.prev(phone);
    }

    public void destroyDefectiveList(){
        for (Phone phone : defectiveList){
            destroyPhone(phone);
        }
    }

    public void addToList(Phone phone){
        defectiveList.add(phone);
    }
}
