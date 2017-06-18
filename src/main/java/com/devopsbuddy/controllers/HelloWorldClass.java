package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PG on 6/18/2017.
 */

@Controller
public class HelloWorldClass {

    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }
}
