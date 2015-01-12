package com.misery.smart.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.misery.smart.base.BaseController;

@Controller
@RequestMapping("/test")
public class TestController extends BaseController{
    
    @ResponseBody
    @RequestMapping(value = "/show")
    public String test(){
        try{
            return new Date() + "你好啊";
        }catch(Exception e){
            exception(e);
            return e.getMessage();
        }
    }
    
    @RequestMapping(value = "/index")
    public String index(){
        return "/index.jsp";
    }
}
