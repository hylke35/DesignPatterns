package com.designpatterns.Employee;

import com.designpatterns.Enum.Status;
import com.designpatterns.Observer.Store;
import com.designpatterns.Phone.Phone;
import com.designpatterns.State.ShipState;

import java.util.ArrayList;

public class Shipper extends Employee{
    private ArrayList<Phone> shipList = new ArrayList<>();
    private ShipState shipState = new ShipState();
    private Packager packager;

    public Shipper(Packager packager) {
        this.packager = packager;
    }

    public ArrayList<Phone> getShipList() {
        return shipList;
    }

    public void addToList(Phone phone){
        shipList.add(phone);
        shipState.setState(phone);
    }

    public void addListToList(ArrayList<Phone> phoneList){
        for(Phone phone : phoneList){
            phone.setStatus(Status.Shipped);
            addToList(phone);
        }
    }

    public void printList(){
        for (Phone phone : shipList){
            System.out.println(phone.getModel());
        }
    }

    public void moveForward(Store store){
        store.addAllToStock(this);
        shipList.clear();
    }

    public void sendBack(Phone phone){
        shipList.remove(phone);
        packager.addToList(phone);
    }

    @Override
    public String process(Phone phone){
        if (phone.getStatus() == Status.Assemble) {
            process = "The phone is currently being assembled";
        } else if (phone.getStatus() == Status.Package){
            process = "The phone is currently being packaged";
        } else if (phone.getStatus() == Status.Ship){
            process = "The phone is here";
        } else if (phone.getStatus() == Status.Shipped){
            process = "The phone is currently has been shipped";
        } else if (phone.getStatus() == Status.Sold){
            process = "The phone has been sold";
        }
        return process;
    }

    @Override
    public Status getState(Phone phone) {
        return phone.getStatus();
    }

    @Override
    public void setState(Phone phone) {
        phone.setStatus(Status.Assemble);
    }
}
