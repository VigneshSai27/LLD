package com.design.patterns.behavioral.comand;

public class MainApp {
    public static void main(String[] args) {

        ACRemote acRemote=new ACRemote();
        AirConditioner ac=new AirConditioner();
        ICommand iCommand=new TurnOnAC(ac);
        acRemote.pressButton(iCommand);
        iCommand=new TurnOffAC(ac);
        acRemote.pressButton(iCommand);
        acRemote.back();
        iCommand=new HandleACTemperature(ac);
        acRemote.pressButton(iCommand);
    }
}
