package com.wengyingjian.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.wengyingjian.kylin", "com.wengyingjian.demo"})
@PropertySource("__artifactId__.properties")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


}