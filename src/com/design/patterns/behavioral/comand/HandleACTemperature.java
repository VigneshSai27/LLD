package com.design.patterns.behavioral.comand;

public class HandleACTemperature implements ICommand {

    AirConditioner airConditioner;

    public HandleACTemperature(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.setTemperature(10);
    }
}
