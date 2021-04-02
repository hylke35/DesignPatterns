package com.designpatterns.Employee;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;
import com.designpatterns.State.PackageState;

import java.util.ArrayList;

public class Packager extends Employee {
    private ArrayList<Phone> packageList = new ArrayList<>();
    private PackageState packageState = new PackageState();
    private Assembler assembler;

    public Packager(Assembler assembler) {
        this.assembler = assembler;
    }

    public ArrayList<Phone> getPackageList() {
        return packageList;
    }

    public void addToList(Phone phone){
        packageList.add(phone);
        packageState.setState(phone);
    }

    public void addListToList(ArrayList<Phone> phoneList){
        for(Phone phone : phoneList){
            phone.setStatus(Status.Ship);
            addToList(phone);
        }
    }

    public void printList(){
        for (Phone phone : packageList){
            System.out.println(phone.getModel());
        }
    }

    public void sendBack(Phone phone){
        packageList.remove(phone);
        assembler.addToList(phone);
    }

    public void moveForward(Shipper shipper){
        shipper.addListToList(packageList);
        packageList.clear();
    }

    public String process(Phone phone) {
        process = packageState.process(phone);
        return process;
    }
}
