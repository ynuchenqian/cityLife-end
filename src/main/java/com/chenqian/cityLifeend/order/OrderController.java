package com.chenqian.cityLifeend.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/")
    public String index(){
        return  "hello world";
    }
}
