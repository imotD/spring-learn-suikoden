package com.example.learnspringbootfromjeff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/helloQuery") //query
    public String helloQuery(@RequestParam("name") String name){
        return "Hello Query My Name " + name;
    }

    @GetMapping(path = "/helloParam/{name}") //param
    public String helloParam(@PathVariable("name") String name){
        return "Hello Param My Name " + name;
    }
}
