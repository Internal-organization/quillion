package com.fr.quillion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Les Choupinets on 13/11/2016.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

}
