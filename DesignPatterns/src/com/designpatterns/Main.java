package com.designpatterns;

import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Decorator.BlackDecorator;
import com.designpatterns.Decorator.Decorator;
import com.designpatterns.Decorator.PhoneDecorator;
import com.designpatterns.Decorator.WhiteDecorator;
import com.designpatterns.Employee.Assembler;
import com.designpatterns.Employee.Packager;
import com.designpatterns.Employee.Shipper;
import com.designpatterns.Enum.Colour;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Observer.Customer;
import com.designpatterns.Observer.Store;

public class Main {

    public static void main(String[] args) {

        Assembler assembler = new Assembler();
        Packager packager = new Packager(assembler);
        WhiteDecorator white = new WhiteDecorator(packager);
        BlackDecorator black = new BlackDecorator(packager);
        PhoneBuilder test = new PhoneBuilder(assembler, black, white);
        test.buildPhone(PhoneName.PhoneUltra, Colour.Black);
        //test.buildPhone(PhoneName.PhoneUltra, Colour.White);
        //test.buildPhone(PhoneName.PhoneMini, Colour.White);
       // test.buildPhone(PhoneName.PhoneMini, Colour.White);
        //test.getPhone().setColour(Colour.White);
       black.decorate();
       //System.out.println(test.getPhone().getColour());

        //white.printWhiteDecoratorList();
        //black.printBlackDecoratorList();
        System.out.println(test.getPhone().getResult());
        //Store store = new Store();
        //store.addToStock(test.getPhone());
       // Customer customer = new Customer(PhoneName.PhoneUltra);
       // System.out.println(customer.isWantedModelInStock());
       // store.subscribeCustomer(customer);
       // store.notifyCustomer();
       // System.out.println(customer.isWantedModelInStock());
       // store.printStock();
        //store.sellPhone(customer.getWantedModel(), customer);
        //store.printStock();
    }
}
