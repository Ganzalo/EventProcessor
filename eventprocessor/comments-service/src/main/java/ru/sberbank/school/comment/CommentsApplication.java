package ru.sberbank.school.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan("ru.sberbank.school.comment")
public class CommentsApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentsApplication.class, args);
    }
}