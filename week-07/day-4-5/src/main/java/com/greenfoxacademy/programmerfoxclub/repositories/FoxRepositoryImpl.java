package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FoxRepositoryImpl implements FoxRepository {

  private Map<String, Fox> foxMap;

  public FoxRepositoryImpl() {
    foxMap = new HashMap<>();
  }

  public Fox finOneById(String name) {
    return foxMap.get(name);
  }

  public void save(Fox fox) {
    foxMap.put(fox.getName(), fox);
  }
}
