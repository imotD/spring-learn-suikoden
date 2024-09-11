package com.example.learnspringbootfromjeff.model.entitiy;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "Hero")
public class Hero {

    @Id
    private String id;
    private String name;
    private String star;
    private Boolean isNewHero;
}
