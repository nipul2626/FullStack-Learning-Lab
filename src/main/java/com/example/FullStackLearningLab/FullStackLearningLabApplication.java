package com.example.FullStackLearningLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class FullStackLearningLabApplication implements CommandLineRunner {


@Autowired
Paymentservice obj1;
@Autowired
NotificationService obj2;

	public static void main(String[] args) {
		SpringApplication.run(FullStackLearningLabApplication.class, args);
	}

@Override
    public void run(String... args){
        obj1.run();
        obj2.Service("Helo");
}

}
