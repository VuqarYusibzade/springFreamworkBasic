package com.example.homeworkspringannotations;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Advice {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex) {
        return "error";
    }
}
