package com.yql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        System.out.println("index page...");
        return "indexV1";
    }
}
