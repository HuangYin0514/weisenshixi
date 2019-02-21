package com.internship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/t")
public class TestController {
    @Autowired
    HttpServletRequest request;

    @GetMapping("h1")
    public String hello(){
        return "hello world";
    }
    @GetMapping("h2")
    public String h2(@RequestParam("name") String name){
        return "h2 " + name ;
    }

    @GetMapping("h3/{name}")
    public String h3(@PathVariable("name") String name){
        return "h3 " + name ;
    }

    // @PostMapping("h4")
    // public String h4(@RequestBody ClassA a){
    //     return a.toString() ;
    // }

    @GetMapping("h5")
    public String h5(){
        return request.getParameter("name");
    }
}
