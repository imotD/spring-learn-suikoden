package com.example.learnspringbootfromjeff.model;

public class Hero {

    private int id;
    private String name;
    private String star;
    private Boolean isNewHero;

    public Hero(int id, String name, String star, Boolean isNewHero) {
        this.id = id;
        this.name = name;
        this.star = star;
        this.isNewHero = isNewHero;
    }

    public Hero() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public Boolean getNewHero() {
        return isNewHero;
    }

    public void setNewHero(Boolean newHero) {
        isNewHero = newHero;
    }
}
