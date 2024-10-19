package com.design.patterns.behavioral.bridge;

public class WhatsappProcessor implements NotificationProcessor{
    @Override
    public void sendNotification() {
        System.out.println("Message processed via Whatsapp");
    }
}
