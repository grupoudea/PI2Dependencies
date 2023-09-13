package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/demo")
public class DemoController {

    @GetMapping
    public String Saludar(){
        return "HOLA MUNDO SPRING BOOT";
    }
}
