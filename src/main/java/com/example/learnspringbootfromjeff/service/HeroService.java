package com.example.learnspringbootfromjeff.service;

import com.example.learnspringbootfromjeff.model.entitiy.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> listHero ();
    Hero addNewHero(Hero request);
    Boolean updateChangeData(Hero request, String id);
    Boolean deleteData(String id);
    Boolean changeStatus(String id, Boolean isNewHero);
}
