package com.design.patterns.structural.bridge;

public class EmailProcessor implements NotificationProcessor{
    @Override
    public void sendNotification() {
        System.out.println("Message processed via email");
    }
}
