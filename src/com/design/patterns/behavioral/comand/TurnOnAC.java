package com.design.patterns.behavioral.comand;

public class TurnOnAC implements ICommand{
    AirConditioner airConditioner;

    public TurnOnAC(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
