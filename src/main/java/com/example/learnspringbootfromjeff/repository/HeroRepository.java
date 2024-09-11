package com.example.learnspringbootfromjeff.repository;

import com.example.learnspringbootfromjeff.model.entitiy.Hero;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeroRepository extends MongoRepository<Hero, String> {

}
