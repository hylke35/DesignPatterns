package com.designpatterns.Observer;

import com.designpatterns.Employee.Shipper;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;
import com.designpatterns.Phone.PhoneMini;
import com.designpatterns.Phone.PhonePro;
import com.designpatterns.Phone.PhoneUltra;

import java.util.*;

public class Store {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Phone> stock = new ArrayList<>();
    private Phone phone;
    private Customer customer;

    public void subscribeCustomer(Customer customer){
        customers.add(customer);
    }

    public void unsubscribeCustomer(Customer customer){
        customers.remove(customer);
    }

    public boolean checkModelInStock(PhoneName model){
        boolean modelInStock = false;

        if (model == PhoneName.PhoneMini){
            modelInStock = Phone.class.isAssignableFrom(PhoneMini.class);
        }else if(model == PhoneName.PhonePro){
            modelInStock = Phone.class.isAssignableFrom(PhoneMini.class);
        }else if(model == PhoneName.PhoneUltra){
            modelInStock = Phone.class.isAssignableFrom(PhoneUltra.class);
        }

        return modelInStock;
    }

    public void notifyCustomer(){
        for(Customer customer: customers) {
            if (checkModelInStock(customer.getWantedModel())) {
                if (customer.wantedModel == PhoneName.PhoneMini) {
                    for (Phone phone : stock) {
                        if (phone instanceof PhoneMini)
                            customer.setWantedModelInStock(true);
                    }
                } else if (customer.wantedModel == PhoneName.PhonePro) {
                    for (Phone phone : stock) {
                        if (phone instanceof PhonePro)
                            customer.setWantedModelInStock(true);
                    }
                } else if (customer.wantedModel == PhoneName.PhoneUltra) {
                    for (Phone phone : stock) {
                        if (phone instanceof PhoneUltra)
                            customer.setWantedModelInStock(true);
                    }
                }
            }
        }
    }

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

    public void sellPhone(PhoneName phoneName, Customer customer){
        ArrayList<Phone> toRemove = new ArrayList<>();
        toRemove.add(phone);
        int index = 0;
        for (Phone phone : stock){
            if(phone.getModel() == phoneName){
                unsubscribeCustomer(customer);
                customer.setPhone(phone);
                phone.setStatus(Status.Sold);
                index = stock.indexOf(phone);
            }
        }
        removeFromStockWithIndex(index);
    }

    public void printStock(){
        for (Phone phone : stock){
            System.out.println(phone.getModel());
        }
    }
}
