package com.designpatterns.Builder;

import com.designpatterns.Employee.Assembler;
import com.designpatterns.Phone.Phone;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;

import java.util.ArrayList;

public class PhoneBuilder {
    public Phone phone;
    public MiniBuilder miniBuilder;
    public ProBuilder proBuilder;
    public UltraBuilder ultraBuilder;

    public PhoneBuilder() {
        miniBuilder = new MiniBuilder();
        proBuilder = new ProBuilder();
        ultraBuilder = new UltraBuilder();
    }

    public Phone buildPhone(PhoneName name, Assembler assembler){
        if (name == PhoneName.PhoneMini) {
            phone = miniBuilder.getPhoneMini();
            miniBuilder.build();
            phone.setStatus(Status.Assemble);
            assembler.addToList(phone);

        } else if (name == PhoneName.PhonePro ) {
            phone = proBuilder.getPhonePro();
            proBuilder.build();
            phone.setStatus(Status.Assemble);
            assembler.addToList(phone);

        } else if (name == PhoneName.PhoneUltra){
            phone = ultraBuilder.getPhoneUltra();
            ultraBuilder.build();
            phone.setStatus(Status.Assemble);
            assembler.addToList(phone);
        }
        return phone;
    };

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public MiniBuilder getMiniBuilder() {
        return miniBuilder;
    }

    public void setMiniBuilder(MiniBuilder miniBuilder) {
        this.miniBuilder = miniBuilder;
    }
}
