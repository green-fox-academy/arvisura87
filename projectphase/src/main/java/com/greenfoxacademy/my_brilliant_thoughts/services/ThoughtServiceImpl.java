package com.greenfoxacademy.my_brilliant_thoughts.services;

import com.greenfoxacademy.my_brilliant_thoughts.models.Thought;
import com.greenfoxacademy.my_brilliant_thoughts.repositories.ThoughtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThoughtServiceImpl implements ThoughtService {

  @Autowired
  ThoughtRepository thoughtRepository;

  @Override
  public void saveNew(String text) {
    Thought newThought = new Thought(text);
    thoughtRepository.save(newThought);
  }

  @Override
  public List<Thought> getAllThoughts() {
    return thoughtRepository.findAll();
  }
}
