package com.design.patterns.behavioral.bridge;

public class EmailProcessor implements NotificationProcessor{
    @Override
    public void sendNotification() {
        System.out.println("Message processed via email");
    }
}
