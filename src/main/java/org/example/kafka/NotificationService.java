package org.example.kafka;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String reminder) {
        // Для простоты — логируем уведомление
        System.out.println("Notification sent: " + reminder);
        // Реализация может быть усложнена (например, отправка email/Telegram)
    }
}
