package com.example.learnspringbootfromjeff.model.entitiy;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {

  @Id
  private Integer id;
  private String name;
  private String gender;
}
