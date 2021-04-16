package com.designpatterns.State;


import com.designpatterns.Phone.Phone;

public interface PhoneState {
    void next(Phone phone);
    void prev(Phone phone);
    void printStatus();
}
