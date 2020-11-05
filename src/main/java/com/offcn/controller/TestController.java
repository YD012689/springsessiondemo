package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","hello");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        String val= (String) session.getAttribute("msg");
        return val;
    }
    @GetMapping("/add")
    public void add(){
        System.out.println("add..");
    }
}
