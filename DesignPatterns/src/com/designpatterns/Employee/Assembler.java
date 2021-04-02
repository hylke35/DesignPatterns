package com.designpatterns.Employee;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;
import com.designpatterns.State.AssembleState;

import java.util.ArrayList;

public class Assembler extends Employee {
    private ArrayList<Phone> assembleList = new ArrayList<>();
    private AssembleState assembleState = new AssembleState();

    public ArrayList<Phone> getAssembleList() {
        return assembleList;
    }

    public void addToList(Phone phone){
        assembleList.add(phone);
        assembleState.setState(phone);
    }

    public void addListToList(ArrayList<Phone> phoneList){
        for(Phone phone : phoneList){
            phone.setStatus(Status.Package);
            addToList(phone);
        }
    }

    public void printList(){
        if(assembleList.size() > 0) {
            for (Phone phone : assembleList) {
                System.out.println(phone.getModel());
            }
        }else{
            System.out.println("This list is empty");
        }
    }

    public void sendBack(Phone phone){
        assembleList.remove(phone);
    }

    public void moveForward(Packager packager){
        packager.addListToList(assembleList);
        assembleList.clear();
    }

    @Override
    public String Process(Phone phone){
        if (phone.getStatus() == Status.Assemble) {
            process = "The phone is here";
        } else if (phone.getStatus() == Status.Package){
            process = "The phone is currently being packaged";
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
