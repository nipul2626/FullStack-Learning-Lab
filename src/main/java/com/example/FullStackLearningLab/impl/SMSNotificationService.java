package com.example.FullStackLearningLab.impl;

import com.example.FullStackLearningLab.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMSNotificationService implements NotificationService {


    public void Service(String message){

        System.out.println("SMS Notification Service "+message);
    }
}
