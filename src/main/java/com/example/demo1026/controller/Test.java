package com.example.demo1026.controller;

import com.example.demo1026.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

    @Autowired
    private Person person;

    @RequestMapping(value = "a")
    @ResponseBody
    public String ctest(){
        return person.toString();
    }
}
