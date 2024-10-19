package com.design.patterns.behavioral.observer;

public class MainApp {
    public static void main(String[] args) {

        Observable iphone = new Iphone();
        Observer iphoneObserver1 = new EmailObserver("Karan", iphone);
        Observer iphoneObserver2 = new EmailObserver("Aditya", iphone);
        Observer iphoneObserver3 = new SMSObserver("Sita", iphone);


        iphone.addObserver(iphoneObserver1);
        iphone.addObserver(iphoneObserver2);
        iphone.addObserver(iphoneObserver3);

        iphone.addStock(3);

        Observable mixer = new Iphone();
        Observer mixerObserver1 = new EmailObserver("Raj", mixer);
        Observer mixerObserver2 = new EmailObserver("Sai", mixer);
        Observer mixerObserver3 = new SMSObserver("Ravi", mixer);
        Observer mixerObserver4 = new SMSObserver("Sweet", mixer);

        mixer.addObserver(mixerObserver1);
        mixer.addObserver(mixerObserver2);
        mixer.addObserver(mixerObserver3);
        mixer.addObserver(mixerObserver4);

        mixer.addStock(3);

        mixer.removeObserver(mixerObserver1);
        mixer.addStock(5);
    }
}
