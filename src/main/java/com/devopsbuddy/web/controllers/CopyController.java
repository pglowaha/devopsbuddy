package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Pawel on 6/25/2017.
 */
@Controller
public class CopyController {

    @RequestMapping("/about")
    public String about(){
        return "copy/about";
    }
}
