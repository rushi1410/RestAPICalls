package com.bridgelabz.restapicalls.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Welcome To RestAPI Calls";
    }
}