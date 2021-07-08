package com.yql.controllerv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        System.out.println("v2.index page...");
        return "indexV2";
    }
}