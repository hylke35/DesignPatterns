package com.designpatterns;

import com.designpatterns.Enums.Colour;

public abstract class Phone  {
    Colour colour;

    public void decorate() {

    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
