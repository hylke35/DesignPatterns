package com.designpatterns.Employee;

import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Observer.Store;
import com.designpatterns.Phone.Phone;
import com.designpatterns.State.AssembleState;
import com.designpatterns.State.ShipState;
import com.designpatterns.State.StoreState;

import java.util.ArrayList;

public class Shipper {
        private ArrayList<Phone> shipList = new ArrayList<>();
        private ShipState shipState = new ShipState();

        public ArrayList<Phone> getShipList() {
            return shipList;
        }

        public void addToList(Phone phone){
            shipList.add(phone);
            phone.setStatus(this.shipState);
        }

        public void printList(){
            if(shipList.size() > 0) {
                for (Phone phone : shipList) {
                    System.out.println(phone.getModel());
                }
            }else{
                System.out.println("This list is empty");
            }
        }

        public void sendToStore(Store store){
            for (Phone phone : shipList){
                phone.setStatus(new StoreState());
            }

            store.addAllToStock(shipList);
        }

        public void sendBackToAssembler(Assembler assembler, Phone phone){
            shipState.prev(phone);
            assembler.addToList(phone);
            shipList.remove(phone);
        }
}
