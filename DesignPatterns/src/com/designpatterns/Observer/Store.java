package com.designpatterns.Observer;

import com.designpatterns.Employee.Shipper;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Phone.Phone;
import com.designpatterns.State.ShipState;
import com.designpatterns.State.SoldState;
import com.designpatterns.State.StoreState;

import java.util.*;

public class Store {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Phone> stock = new ArrayList<>();
    private StoreState storeState = new StoreState();

    public void subscribeCustomer(Customer customer){
        customers.add(customer);
    }

    public void unsubscribeCustomer(Customer customer){
        customers.remove(customer);
    }

    public boolean checkModelInStock(PhoneName model){
        boolean modelInStock = false;

        for (Phone phone : stock) {
            modelInStock = phone.getModel() == model;
        }

        return modelInStock;
    }

    public void notifyCustomer(){
        for(Customer customer: customers) {
            if (checkModelInStock(customer.getWantedModel())) {
                for (Phone phone : stock) {
                    if (phone.getFrame() == "Mini Frame") {
                        if (customer.wantedModel == PhoneName.PhoneMini) {
                            customer.setWantedModelInStock(true);
                        }
                    } else if (phone.getFrame() == "Pro Frame") {
                        if (customer.wantedModel == PhoneName.PhonePro) {
                            customer.setWantedModelInStock(true);
                        }
                    } else if (phone.getFrame() == "Ultra Frame") {
                        if (customer.wantedModel == PhoneName.PhoneUltra) {
                            customer.setWantedModelInStock(true);
                        }
                    }
                }
            }else{
                customer.setWantedModelInStock(false);
            }
        }
    }

    public void addToStock(Phone phone){
        stock.add(phone);
        storeState.setStoreState(phone);
    }

    public void removeFromStock(Phone phone){
        stock.remove(phone);
    }

    public void removeFromStockWithIndex(int index){stock.remove(index);}

    public void addAllToStock(ArrayList<Phone> phoneList){
        for(Phone phone : phoneList) {
            addToStock(phone);
        }
    }

    public void sellPhone(Customer customer){
        boolean phoneInStock = false;
        int index = 0;
        if(stock.size() > 0) {
            for (Phone phone : stock) {
                if (phone.getModel() == customer.getWantedModel()) {
                    phoneInStock = true;
                    unsubscribeCustomer(customer);
                    customer.setPhone(phone);
                    phone.setStatus(new SoldState());
                    storeState.next(phone);
                    index = stock.indexOf(phone);
                }
            }
            removeFromStockWithIndex(index);
        }

        if(!phoneInStock){
            System.out.print("The customer's wanted model is not in stock!");
        }

        notifyCustomer();
    }

    public void printStock(){
        for (Phone phone : stock){
            System.out.println(phone.getModel());
        }
    }

    public void sendBackToShipper(Shipper shipper, Phone phone){
        shipper.addToList(phone);
        phone.setStatus(new ShipState());
        stock.remove(phone);
    }
}
