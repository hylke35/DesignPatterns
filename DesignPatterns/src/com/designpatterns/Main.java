package com.designpatterns;

import com.designpatterns.Builder.MiniBuilder;
import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Builder.ProBuilder;
import com.designpatterns.Builder.UltraBuilder;
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
import com.designpatterns.Phone.Phone;

public class Main {

    public static void main(String[] args) {

        // New builder method to make a phone

        Assembler assembler = new Assembler();
        PhoneBuilder miniBuilder = new MiniBuilder();
        PhoneBuilder proBuilder = new ProBuilder();
        PhoneBuilder ultraBuilder = new UltraBuilder();

        assembler.setPhoneBuilder(miniBuilder);
        assembler.assemblePhone();

        Phone phone = assembler.getPhone();

        System.out.println(phone);

        // A miniphone should now be assembled.


        Packager packager = new Packager(assembler);
        Shipper shipper = new Shipper(packager);

        WhiteDecorator white = new WhiteDecorator();
        BlackDecorator black = new BlackDecorator();

        Store store = new Store();
        Customer customer1 = new Customer(PhoneName.PhonePro);
        Customer customer2 = new Customer(PhoneName.PhonePro);
        Customer customer3 = new Customer(PhoneName.PhonePro);

        //white.printWhiteDecoratorList();
        //black.printBlackDecoratorList();
        black.decorate();
        white.decorate();


        //assembler.printList();
        //System.out.println(assembler.process(builder.getPhone()));
        assembler.moveForward(packager);
        //System.out.println(assembler.process(builder.getPhone()));
        //packager.printList();
        packager.moveForward(shipper);
        //System.out.println(assembler.process(builder.getPhone()));
        //shipper.printList();
        shipper.moveForward(store);


        //store.printStock();
        store.subscribeCustomer(customer1);
        store.subscribeCustomer(customer2);
        store.subscribeCustomer(customer3);
        //store.notifyCustomer();
        System.out.println(customer3.isWantedModelInStock());
        store.sellPhone(customer1);
        store.sellPhone(customer2);
        System.out.println(customer3.isWantedModelInStock());
        store.sellPhone(customer3);
        System.out.println(customer1.getPhone());
    }
}
