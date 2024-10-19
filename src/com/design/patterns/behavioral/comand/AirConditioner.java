package com.design.patterns.behavioral.comand;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOn() {
        isOn=true;
        System.out.println("AC is On.");
    }

    public void turnOff() {
        isOn=false;
        System.out.println("AC is Off.");
    }

    public void setTemperature(int temperature) {
        if(isOn) {
            this.temperature=temperature;
            System.out.println("AC Temperature set to "+temperature);
        }
        else System.out.println("AC is not turned on");
    }
}
