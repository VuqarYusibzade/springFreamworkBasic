package com.example.homeworkspringannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HomeWorkSpringAnnotationsApplication implements CommandLineRunner {


    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(HomeWorkSpringAnnotationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    int beanDefinitionCount=applicationContext.getBeanDefinitionCount();
        System.out.println("Bean sayi : "+beanDefinitionCount);

      String[] beanDefinitionNames=applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName:beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
