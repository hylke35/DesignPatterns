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
        Shipper shipper = new Shipper(packager);

        WhiteDecorator white = new WhiteDecorator();
        BlackDecorator black = new BlackDecorator();
        PhoneBuilder builder = new PhoneBuilder(assembler, black, white);

        Store store = new Store();
        Customer customer1 = new Customer(PhoneName.PhonePro);
        Customer customer2 = new Customer(PhoneName.PhonePro);
        Customer customer3 = new Customer(PhoneName.PhonePro);


        //builder.buildPhone(PhoneName.PhoneUltra, Colour.Black);
        builder.buildPhone(PhoneName.PhonePro, Colour.Black);
        //builder.buildPhone(PhoneName.PhoneMini, Colour.Black);
        //builder.buildPhone(PhoneName.PhoneUltra, Colour.White);
        builder.buildPhone(PhoneName.PhonePro, Colour.White);
        //builder.buildPhone(PhoneName.PhoneMini, Colour.White);

        //white.printWhiteDecoratorList();
        //black.printBlackDecoratorList();
        black.decorate();
        white.decorate();


        //assembler.printList();
        assembler.moveForward(packager);
        //packager.printList();
        packager.moveForward(shipper);
        //shipper.printList();
        shipper.moveForward(store);


        //store.printStock();
        store.subscribeCustomer(customer1);
        store.subscribeCustomer(customer2);
        store.subscribeCustomer(customer3);
        store.notifyCustomer();
        System.out.println(customer3.isWantedModelInStock());
        store.sellPhone(customer1);
        store.sellPhone(customer2);
        System.out.println(customer3.isWantedModelInStock());
        store.sellPhone(customer3);
        System.out.println(customer1.getPhone());
    }
}
