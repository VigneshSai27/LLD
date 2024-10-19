package com.design.patterns.behavioral.bridge;

public class MainApp {
    public static void main(String[] args) {
        NotificationProcessor emailProcessor = new EmailProcessor();
        NotificationProcessor whatsappProcessor = new WhatsappProcessor();
        NotificationProcessor smsProcessor = new SMSProcessor();
        NotificationType msg1 = new TextMessage(emailProcessor);
        NotificationType msg2 = new QRMessage(whatsappProcessor);
        NotificationType msg3 = new TextMessage(smsProcessor);

        msg1.sendMessage();
        msg2.sendMessage();
        msg3.sendMessage();

    }
}
