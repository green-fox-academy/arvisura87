package com.greenfoxacademy.my_brilliant_thoughts.services;

import com.greenfoxacademy.my_brilliant_thoughts.models.Thought;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ThoughtService {

  void saveNew(String text);
  List<Thought> getAllThoughts();

}
