package com.greenfoxacademy.programmerfoxclub.models;

import lombok.Data;

import java.util.List;

@Data
public class Fox {

  private String name;
  private List<Trick> trikList;
  private List<Food> foodList;
  private List<Drink> drinkList;

}
