package com.design.patterns.behavioral.bridge;

public class TextMessage extends NotificationType {
    NotificationProcessor notificationProcessor;

    public TextMessage(NotificationProcessor notificationProcessor) {
        this.notificationProcessor = notificationProcessor;
    }

    @Override
    public void sendMessage() {
        System.out.println("Message Type: TEXT");
        notificationProcessor.sendNotification();
    }
}
