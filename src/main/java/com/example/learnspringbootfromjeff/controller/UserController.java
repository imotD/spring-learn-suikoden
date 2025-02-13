package com.example.learnspringbootfromjeff.controller;

import com.example.learnspringbootfromjeff.model.entitiy.User;

import com.example.learnspringbootfromjeff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/create")
  private User create(@RequestBody User request) {
    return userService.create(request);
  }

}
