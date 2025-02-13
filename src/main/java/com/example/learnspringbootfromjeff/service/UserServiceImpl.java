package com.example.learnspringbootfromjeff.service;

import com.example.learnspringbootfromjeff.model.entitiy.User;
import com.example.learnspringbootfromjeff.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public User create(User request) {
    return userRepository.save(request);
  }
}
