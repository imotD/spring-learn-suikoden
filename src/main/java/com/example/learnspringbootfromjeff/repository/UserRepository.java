package com.example.learnspringbootfromjeff.repository;

import com.example.learnspringbootfromjeff.model.entitiy.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
