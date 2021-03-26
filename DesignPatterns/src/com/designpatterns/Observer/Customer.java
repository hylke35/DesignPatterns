package com.designpatterns.Observer;

import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Phone.Phone;

public class Customer {
    PhoneName wantedModel;
    Phone phone;
    boolean wantedModelInStock = false;

    public Customer(PhoneName wantedModel) {
        this.wantedModel = wantedModel;
    }

    public PhoneName getWantedModel() {
        return wantedModel;
    }

    public void setWantedModel(PhoneName wantedModel) {
        this.wantedModel = wantedModel;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public boolean isWantedModelInStock() {
        return wantedModelInStock;
    }

    public void setWantedModelInStock(boolean wantedModelInStock) {
        this.wantedModelInStock = wantedModelInStock;
    }
}
