package com.designpatterns.Builder;

import com.designpatterns.Enums.PhoneName;
import com.designpatterns.Enums.Status;
import com.designpatterns.Phone;

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
}
