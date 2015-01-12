package com.misery.smart.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    
    @ResponseBody
    @RequestMapping(value = "/show")
    public String test(){
        return new Date() + "你好啊";
    }
    
    @RequestMapping(value = "/index")
    public String index(){
        return "/index.jsp";
    }
}
