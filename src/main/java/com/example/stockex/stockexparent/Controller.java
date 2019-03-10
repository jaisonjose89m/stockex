package com.example.stockex.stockexparent;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/ping")
    public String ping(){
        return "App up and running!!!";
    }
}
