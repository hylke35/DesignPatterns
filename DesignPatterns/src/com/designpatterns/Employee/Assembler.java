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

    public String process(Phone phone){
        process = assembleState.process(phone);
        return process;
    }
}
