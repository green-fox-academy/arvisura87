package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxRepository {

  Fox finOneById(String name);

  void save(Fox fox);
}
