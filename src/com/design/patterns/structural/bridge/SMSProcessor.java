package com.design.patterns.structural.bridge;

public class SMSProcessor implements NotificationProcessor{
    @Override
    public void sendNotification() {
        System.out.println("Message processed via SMS");
    }
}
