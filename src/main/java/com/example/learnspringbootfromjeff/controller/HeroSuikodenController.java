package com.example.learnspringbootfromjeff.controller;

import com.example.learnspringbootfromjeff.model.entitiy.Hero;
import com.example.learnspringbootfromjeff.service.HeroService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
@Api(value = "Hero Controller")
public class HeroSuikodenController {

    @Autowired
    HeroService heroService;

    @GetMapping(path = "/list-hero")
    @Operation(description = "Api untuk melihat list hero")
    public List<Hero> listHero (){
       return heroService.listHero();
    }

    @PostMapping(path = "/add")
    @Operation(description = "Api untuk menambahkan hero")
    public Hero addNewHero(@RequestBody Hero request){
        return heroService.addNewHero(request);
    }

    @PutMapping(path = "/update/{id}")
    @Operation(description = "Api untuk mengupdate hero")
    public Boolean updateChangeData (@RequestBody Hero request, @PathVariable String id){
        return heroService.updateChangeData(request, id);
    }

    @DeleteMapping(path = "/deleted/{id}")
    @Operation(description = "Api untuk menghapus hero")
    public Boolean deleteData (@PathVariable String id){
        return heroService.deleteData(id);
    }

    @PatchMapping(path = "/change-status/{id}")
    @Operation(description = "Api untuk update isNewHero ")
    public Boolean changeStatus (@PathVariable String id, @RequestParam Boolean isNewHero){
        return heroService.changeStatus(id,isNewHero);
    }
}