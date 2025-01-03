package org.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LessonConsumer {

    Logger logger = Logger.getLogger(getClass().getName());

    // Аннотация @KafkaListener указывает на топик, который будет слушаться
    @KafkaListener(topics = "lesson-created", groupId = "lesson-group")
    public void consume(String message) {
        // Логируем пришедшее сообщение
        logger.info("Получено новое сообщение: " + message);

        // Декодируем сообщение (можно использовать JSON-парсер, но для простоты используем строку как есть)
        // Предположим, что сообщение приходит в виде JSON-строки: {"lessonId": "lesson-1234", "title": "Как создать REST API"}

        // Например, выводим просто название урока
        // Реально, вы могли бы добавить логику для парсинга и сохранения в базу данных
        System.out.println("Урок создан: " + message);
    }
}

