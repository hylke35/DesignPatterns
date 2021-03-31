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

    public void sendBack(Phone phone){
        packageList.remove(phone);
        assembler.addToList(phone);
    }

    public void moveForward(Shipper shipper){
        shipper.addListToList(shipper.getShipList());
        packageList.clear();
    }
    @Override
    public String Process(Phone phone) {
        if (phone.getStatus() == Status.Assemble) {
            process = "The phone is currently being assembled";
        } else if (phone.getStatus() == Status.Package){
            process = "The phone is here";
        } else if (phone.getStatus() == Status.Ship){
            process = "The phone is currently being prepared for shipping";
        } else if (phone.getStatus() == Status.Shipped){
            process = "The phone is currently has been shipped";
        } else if (phone.getStatus() == Status.Sold){
            process = "The phone has been sold";
        }
        return process;
    }
   

}
