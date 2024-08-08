package com.example.homeworkspringannotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
//@ResponseBody
//yuxardaki ikisi, 1 annotasiayda birlesdirilib.
@RestController(value = "RestTestBean")
public class UserController {

    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name) {
        return "Hello, " + name + "!";
    }
}
