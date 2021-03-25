package com.designpatterns.Builder;

import com.designpatterns.Enums.Status;
import com.designpatterns.Phone;

public class PhoneMini extends Phone {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
