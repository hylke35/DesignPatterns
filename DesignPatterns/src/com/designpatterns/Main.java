package com.designpatterns;

import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Decorator.Decorater;
import com.designpatterns.Decorator.PhoneDecorator;
import com.designpatterns.Decorator.WhiteDecorater;
import com.designpatterns.Employee.Assembler;
import com.designpatterns.Employee.Shipper;
import com.designpatterns.Enum.Colour;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Observer.Customer;
import com.designpatterns.Observer.Store;

public class Main {

    public static void main(String[] args) {
        PhoneBuilder test = new PhoneBuilder();
        Assembler assembler = new Assembler();
        test.buildPhone(PhoneName.PhoneUltra, assembler);
        test.buildPhone(PhoneName.PhoneUltra, assembler);
        test.buildPhone(PhoneName.PhoneMini, assembler);
        test.buildPhone(PhoneName.PhoneMini, assembler);
        //test.getPhone().setColour(Colour.White);
        //System.out.println(test.getPhone().getColour());
        //WhiteDecorater white = new WhiteDecorater(test.getPhone());
        //System.out.println(white.getDecoratedPhone());
        //white.decorate();
        System.out.println(test.getPhone().getResult());
        Store store = new Store();
        //store.addToStock(test.getPhone());
        Customer customer = new Customer(PhoneName.PhoneUltra);
        System.out.println(customer.isWantedModelInStock());
        store.subscribeCustomer(customer);
        store.notifyCustomer();
        System.out.println(customer.isWantedModelInStock());
        store.printStock();
        store.sellPhone(customer.getWantedModel(), customer);
        store.printStock();
    }
}
