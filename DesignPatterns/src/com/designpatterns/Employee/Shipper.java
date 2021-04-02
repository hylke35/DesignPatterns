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
        process = shipState.process(phone);
        return process;
    }
}
