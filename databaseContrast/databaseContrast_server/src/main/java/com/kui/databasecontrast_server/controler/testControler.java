package com.kui.databasecontrast_server.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControler {

    @RequestMapping("/constrast/test")
    public String test1(){
        System.out.println("--------------------test---------------");
        return "test123";
    }

}
