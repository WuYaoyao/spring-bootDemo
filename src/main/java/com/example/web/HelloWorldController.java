package com.example.web;

import com.example.domain.HelloWorld;
import com.example.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wuyaoyao on 16/9/22.
 */

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldService service;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ModelAndView doSomething(ModelAndView mv){
        //mv.addAllObjects("HelloWorld",HelloWorld);
        mv.addObject("hellowordls",service.helloWorld());
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HelloWorld helloWorld) {
        service.save(helloWorld);
        return new ModelAndView("test");
    }
}
