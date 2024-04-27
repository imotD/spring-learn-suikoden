package com.example.learnspringbootfromjeff.controller;

import com.example.learnspringbootfromjeff.model.Hero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hero")
public class HeroSuikodenController {

    public List<Hero> heroes = new ArrayList<>();
    public Integer counter = 1;

    @GetMapping(path = "/list-hero")
    public List<Hero> daftarHero (){
        return heroes;
    }

    @PostMapping(path = "/add")
    public Hero addNewHero(@RequestBody Hero request){
        request.setId(counter);
        heroes.add(request);
        counter++;
        return request;
    }

    @PutMapping(path = "/update/{id}")
    public Boolean updateChangeData (@RequestBody Hero request,@PathVariable Integer id){
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();

        if(result.isPresent()){
            result.get().setName(request.getName());
            result.get().setStar(request.getStar());

            return true;
        } else {
            return false;
        }
    }

    @DeleteMapping(path = "/deleted/{id}")
    public Boolean deleteData (@PathVariable Integer id){
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();

        if(result.isPresent()){
            heroes.remove(result.get());
            return true;
        } else {
            return false;
        }
    }

    @PatchMapping(path = "/change-status/{id}")
    public  Boolean changeStatus (@PathVariable Integer id, @RequestParam Boolean isNewHero){
        final Optional<Hero> result = heroes.stream().filter(hero -> hero.getId() == id).findFirst();

        if(result.isPresent()){
            result.get().setNewHero(isNewHero);
            return true;
        } else {
            return false;
        }
    }
}
it