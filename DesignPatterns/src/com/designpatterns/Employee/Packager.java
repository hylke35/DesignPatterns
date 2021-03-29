package com.designpatterns.Employee;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;

import java.util.ArrayList;

public class Packager extends Employee {
    private ArrayList<Phone> packageList = new ArrayList<>();
    Assembler assembler;

    public ArrayList<Phone> getPackageList() {
        return packageList;
    }

        public void setPackageList(ArrayList<Phone> assembleList) {
        this.packageList = assembleList;
    }

    @Override
    public void addToList(Phone phone){
        packageList.add(phone);
    }

    //@Override
    public void doSomething(Phone phone){
        phone = this.phone;
    }
    //@Override
    public void sendBack(Phone phone){
        packageList.remove(phone);
        assembler.assembleList.add(phone);
    }
public String Process(Phone phone){
        String process = null;
        if(phone.getStatus() == Status.Package ){
            process = "the phone is Packaging";
        }
        return process;
    }
   

}
