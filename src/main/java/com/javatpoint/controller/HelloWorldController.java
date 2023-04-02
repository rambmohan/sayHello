package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "Hello ***************";
}



@RequestMapping("/{name}")
    public String hello(@RequestParam String name)
    {
        return "Hello *************** "+name;
    }
}
