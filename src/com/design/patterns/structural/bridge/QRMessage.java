package com.design.patterns.structural.bridge;

public class QRMessage extends NotificationType {
    NotificationProcessor notificationProcessor;

    public QRMessage(NotificationProcessor notificationProcessor) {
        this.notificationProcessor = notificationProcessor;
    }

    @Override
    public void sendMessage() {
        System.out.println("Message Type: QR");
        notificationProcessor.sendNotification();
    }
}
