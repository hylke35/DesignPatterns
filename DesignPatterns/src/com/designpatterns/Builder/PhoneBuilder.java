package com.designpatterns.Builder;

import com.designpatterns.Phone;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;

public class PhoneBuilder {
    protected Phone phone;
    protected MiniBuilder miniBuilder;

    public Phone buildPhone(PhoneName name){
        if (name == PhoneName.PhoneMINI) {
            phone = miniBuilder.getPhoneMini();
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
