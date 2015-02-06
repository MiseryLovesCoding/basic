package com.misery.smart.controller;

import com.misery.smart.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class SysController extends BaseController{
    
    @RequestMapping(value = "/login")
    public String login(){
//        try{
//            return new Date() + "你好啊";
//        }catch(Exception e){
//            exception(e);
//            return e.getMessage();
//        }
        return "login.jsp";
    }
    
    @RequestMapping(value = "/index")
    public String index(){
        return "/index.jsp";
    }
}
