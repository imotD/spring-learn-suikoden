package com.example.learnspringbootfromjeff.service;

import com.example.learnspringbootfromjeff.model.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService{

    public List<Hero> heroes = new ArrayList<>();
    public Integer counter = 1;
    @Override
    public List<Hero> listHero() {
        return heroes;
    }

    @Override
    public Hero addNewHero(Hero request) {
        request.setId(counter);
        heroes.add(request);
        counter++;
        return request;
    }

    @Override
    public Boolean updateChangeData(Hero request, Integer id) {
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();

        if(result.isPresent()){
            result.get().setName(request.getName());
            result.get().setStar(request.getStar());

            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean deleteData(Integer id) {
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();

        if(result.isPresent()){
            heroes.remove(result.get());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean changeStatus(Integer id, Boolean isNewHero) {
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();

        if(result.isPresent()){
            result.get().setIsNewHero(isNewHero);
            return true;
        } else {
            return false;
        }
    }
}
