package com.example.learnspringbootfromjeff.service;

import com.example.learnspringbootfromjeff.model.entitiy.Hero;
import com.example.learnspringbootfromjeff.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService{

    @Autowired
    HeroRepository heroRepository;

    @Override
    public List<Hero> listHero() {
        return heroRepository.findAll();
    }

    @Override
    public Hero addNewHero(Hero request) {
        // save ke mongodb
        heroRepository.save(request);
        return request;
    }

    @Override
    public Boolean updateChangeData(Hero request, String id) {
        Optional<Hero> result = heroRepository.findById(id);
        if (result.isPresent()) {
            result.get().setName(request.getName());
            result.get().setStar(request.getStar());
            heroRepository.save(result.get());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean deleteData(String id) {
       heroRepository.findById(id);
       return true;
    }

    @Override
    public Boolean changeStatus(String id, Boolean isNewHero) {

        final Optional<Hero> result = heroRepository.findById(id);

        if(result.isPresent()){
            Hero hero = result.get();
            hero.setIsNewHero(isNewHero);
            heroRepository.save(hero);
            return true;
        } else {
            return false;
        }
    }
}
