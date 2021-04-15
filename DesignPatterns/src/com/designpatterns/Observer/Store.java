package com.designpatterns.Observer;

import com.designpatterns.Employee.Shipper;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;

import java.util.*;

public class Store {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Phone> stock = new ArrayList<>();

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

    /*public void notifyCustomer(){
        for(Customer customer: customers) {
            if (checkModelInStock(customer.getWantedModel())) {
                for (Phone phone : stock) {
                    if (phone instanceof PhoneMini) {
                        if (customer.wantedModel == PhoneName.PhoneMini) {
                            customer.setWantedModelInStock(true);
                        }
                    } else if (phone instanceof PhonePro) {
                        if (customer.wantedModel == PhoneName.PhonePro) {
                            customer.setWantedModelInStock(true);
                        }
                    } else if (phone instanceof PhoneUltra) {
                        if (customer.wantedModel == PhoneName.PhoneUltra) {
                            customer.setWantedModelInStock(true);
                        }
                    }
                }
            }else{
                customer.setWantedModelInStock(false);
            }
        }
    }*/

    public void addToStock(Phone phone){
        stock.add(phone);
        phone.setStatus(Status.Shipped);
    }

    public void removeFromStock(Phone phone){
        stock.remove(phone);
    }

    public void removeFromStockWithIndex(int index){stock.remove(index);}

    public void addAllToStock(Shipper shipper){
        for(Phone phone : shipper.getShipList()){
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
                    phone.setStatus(Status.Sold);
                    index = stock.indexOf(phone);
                }
            }
            removeFromStockWithIndex(index);
        }

        if(!phoneInStock){
            System.out.print("The customer's wanted model is not in stock!");
        }

        //notifyCustomer();
    }

    public void printStock(){
        for (Phone phone : stock){
            System.out.println(phone.getModel());
        }
    }
}
