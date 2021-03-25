package com.designpatterns.Builder;

import com.designpatterns.Phone;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;

public class PhoneBuilder {
    public Phone phone;
    public MiniBuilder miniBuilder = new MiniBuilder();


    public Phone buildPhone(PhoneName name){
        if (name == PhoneName.PhoneMINI) {
            phone = miniBuilder.getPhoneMini();
            miniBuilder.build();
            phone.setResult();
            phone.setStatus(Status.Assemble);
        } else if (name == PhoneName.PhonePro ) {
            //phone = ;
            phone.setStatus(Status.Assemble);
        } else if (name == PhoneName.PhoneUltra){
            //phone = ;
            phone.setStatus(Status.Assemble);
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
