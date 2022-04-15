package com.example.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/add")
    public int sum(){
        int a=5;
        int b=4;
        int c=a+b;
        return c;
    }

    @RequestMapping("/sum")
    public String addition(){
        int a=9;
        int b=9;
        int c=a+b;
        return "Addition is: "+c;
    }

    @RequestMapping("/minus")
    public int subtraction(){
        int a=36;
        int b=9;
        int c=a-b;
        return c;
    }

    @RequestMapping("/subtraction")
    public String minus(){
        int a=97;
        int b=56;
        int c=a-b;
        return "Subtraction is: "+c;
    }

    @RequestMapping("/into")
    public String multiply(){
        int a=4;
        int b=5;
        int c=a*b;
        return "multiplication is: "+c;
    }

    @RequestMapping("/multiply")
    public int multiplication(){
        int a=9;
        int b=4;
        int c=a*b;
        return c;
    }

    @RequestMapping("/division")
    public int divide(){
        int a=45;
        int b=5;
        int c=a/b;
        return c;
    }


    @RequestMapping("/divide")
    public String division(){
        int a=28;
        int b=4;
        int c=a/b;
        return "Division is: "+c;
    }


    @RequestMapping("/type")
    public String statement(){
        return "Hello, How are you?";
    }

    @RequestMapping("/salary")
    public double mySalary(){
        return 184635.563;
    }

    @RequestMapping("/print")
    public int number(){
        return 65;

    }

    @RequestMapping("/printinfo")
    public String information(){
        return "What type of info do you want?";
    }
}
