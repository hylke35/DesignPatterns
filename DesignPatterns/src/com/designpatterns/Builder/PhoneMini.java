package com.designpatterns.Builder;

import com.designpatterns.Enums.PhoneName;
import com.designpatterns.Phone;

import java.util.ArrayList;

public class PhoneMini implements Phone {
    public ArrayList<object> partsList;

    public PhoneMini() {
        partsList = new ArrayList<object>();
    }

    public void addPart(object part){
        this.partsList.add(part);
    }

    public object listParts() {
        for (object part: partsList) {
            System.out.println(part);
        }
    }


}
