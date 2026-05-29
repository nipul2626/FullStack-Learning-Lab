package com.example.FullStackLearningLab.impl;

import com.example.FullStackLearningLab.NotificationService;
import org.springframework.stereotype.Component;


@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void Service(String message){
        System.out.println("Email Notification Service"+message);
    }
}
