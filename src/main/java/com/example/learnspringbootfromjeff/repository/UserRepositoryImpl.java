package com.example.learnspringbootfromjeff.repository;

import com.example.learnspringbootfromjeff.model.entitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class UserRepositoryImpl implements UserRepositoryCustom{

  @Autowired
  MongoTemplate mongoTemplate;

  @Override
  public User create(User request) {
   return mongoTemplate.insert(request,"user ");
  }
}
