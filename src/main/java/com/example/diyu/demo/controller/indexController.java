package com.example.diyu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class indexController {

    /*访问首页*/
    @RequestMapping("/index")
    public String home(HttpServletResponse res, HttpServletRequest req) throws Exception{
       return   "redurect:/login";
    }

    @RequestMapping("/king")
    @ResponseBody
    public String King(){
        return   "Hello World";
    }

    @RequestMapping("/wing")
    @ResponseBody
    public String Wing(){
        return   "Hello World";
    }

}
