package com.designpatterns.Builder;

import com.designpatterns.Decorator.BlackDecorator;
import com.designpatterns.Decorator.WhiteDecorator;
import com.designpatterns.Employee.Assembler;
import com.designpatterns.Enum.Colour;
import com.designpatterns.Phone.Phone;
import com.designpatterns.Enum.PhoneName;
import com.designpatterns.Enum.Status;

import java.util.ArrayList;

public class PhoneBuilder {
    private Phone phone;
    private MiniBuilder miniBuilder;
    private ProBuilder proBuilder;
    private UltraBuilder ultraBuilder;
    private Assembler assembler;
    private WhiteDecorator whiteDecorator;
    private BlackDecorator blackDecorator;

    public PhoneBuilder(Assembler assemblerName, BlackDecorator black, WhiteDecorator white) {
        assembler = assemblerName;
        miniBuilder = new MiniBuilder();
        proBuilder = new ProBuilder();
        ultraBuilder = new UltraBuilder();
        whiteDecorator = white;
        blackDecorator = black;
    }

    public Phone buildPhone(PhoneName name, Colour colour){
        if (name == PhoneName.PhoneMini && colour == Colour.White) {
            phone = miniBuilder.getPhoneMini();
            miniBuilder.build();
            assembler.addToList(phone);
            whiteDecorator.addToWhiteDecoratorList(phone);
        } else if (name == PhoneName.PhonePro && colour == Colour.White) {
            phone = proBuilder.getPhonePro();
            proBuilder.build();
            assembler.addToList(phone);
            whiteDecorator.addToWhiteDecoratorList(phone);
        } else if (name == PhoneName.PhoneUltra && colour == Colour.White){
            phone = ultraBuilder.getPhoneUltra();
            ultraBuilder.build();
            assembler.addToList(phone);
            whiteDecorator.addToWhiteDecoratorList(phone);
        }

        else if (name == PhoneName.PhoneMini && colour == Colour.Black) {
            phone = miniBuilder.getPhoneMini();
            miniBuilder.build();
            assembler.addToList(phone);
            blackDecorator.addToBlackDecoratorList(phone);
        } else if (name == PhoneName.PhonePro && colour == Colour.Black) {
            phone = proBuilder.getPhonePro();
            proBuilder.build();
            assembler.addToList(phone);
            blackDecorator.addToBlackDecoratorList(phone);
        } else if (name == PhoneName.PhoneUltra && colour == Colour.Black){
            phone = ultraBuilder.getPhoneUltra();
            ultraBuilder.build();
            assembler.addToList(phone);
            blackDecorator.addToBlackDecoratorList(phone);
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
