package com.ly.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by BorisLiu on 2019/9/5
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


}
