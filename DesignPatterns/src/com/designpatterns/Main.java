package com.designpatterns;

import com.designpatterns.Builder.MiniBuilder;
import com.designpatterns.Builder.PhoneBuilder;
import com.designpatterns.Builder.ProBuilder;
import com.designpatterns.Builder.UltraBuilder;
import com.designpatterns.Decorator.WhiteDecorator;
import com.designpatterns.Employee.Assembler;
import com.designpatterns.Employee.Shipper;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Observer.Customer;
import com.designpatterns.Observer.Store;
import com.designpatterns.Phone.Phone;

public class Main {

    public static void main(String[] args) {

        // New builder method to make a phone
        Shipper shipper = new Shipper();
        Assembler assemblerMini = new Assembler();
        Assembler assemblerPro = new Assembler();
        Assembler assemblerUltra = new Assembler();
        PhoneBuilder miniBuilder = new MiniBuilder();
        PhoneBuilder proBuilder = new ProBuilder();
        PhoneBuilder ultraBuilder = new UltraBuilder();
        Store store = new Store();
        Customer customer1 = new Customer(PhoneName.PhoneMini);
        Customer customer2 = new Customer(PhoneName.PhonePro);

        assemblerMini.setPhoneBuilder(miniBuilder);
        assemblerMini.assemblePhone();
        assemblerPro.setPhoneBuilder(proBuilder);
        assemblerPro.assemblePhone();
        Phone phone1 = assemblerMini.getPhone();
        Phone phone2 = assemblerPro.getPhone();


        assemblerMini.sendToShipper(shipper);
        assemblerPro.sendToShipper(shipper);

        shipper.sendToStore(store);
        System.out.println(phone1.getStatus());

        store.printStock();
        store.subscribeCustomer(customer1);
        store.subscribeCustomer(customer2);
        store.notifyCustomer();
        store.sellPhone(customer1);
        store.sellPhone(customer2);

        System.out.println(customer1.getPhone().getModel());
        System.out.println(customer2.getPhone().getModel());
        System.out.println(phone1.getStatus());
        System.out.println(phone2.getStatus());

    }
}
