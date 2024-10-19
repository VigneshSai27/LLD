package com.design.patterns.behavioral.comand;

public class TurnOffAC implements ICommand{
    AirConditioner airConditioner;

    public TurnOffAC(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
