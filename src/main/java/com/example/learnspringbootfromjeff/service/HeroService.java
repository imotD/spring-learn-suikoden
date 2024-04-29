package com.example.learnspringbootfromjeff.service;

import com.example.learnspringbootfromjeff.model.Hero;

import java.util.List;

public interface HeroService {
    List<Hero> listHero ();
    Hero addNewHero(Hero request);
    Boolean updateChangeData(Hero request, Integer id);
    Boolean deleteData(Integer id);
    Boolean changeStatus(Integer id, Boolean isNewHero);
}
