package com.example.learnspringbootfromjeff.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    private int id;
    private String name;
    private String star;
    private Boolean isNewHero;
}
