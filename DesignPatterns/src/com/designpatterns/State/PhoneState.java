package com.designpatterns.State;

import com.designpatterns.Enum.Status;
import com.designpatterns.Phone.Phone;

public interface PhoneState {
    String process(Phone phone);
    void setPhone(Phone phone);
    Phone getPhone();
    Status getState(Phone phone);
    void setState(Phone phone);
}
