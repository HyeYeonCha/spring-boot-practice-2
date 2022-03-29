package com.springboot.springbootpractice2;

import com.springboot.springbootpractice2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

@EnableCaching
@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootPractice2Application {

//    private final MyProperties myProperties;
    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPractice2Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("jack");
    }
}
