package com.greenfoxacademy.my_brilliant_thoughts.repositories;

import com.greenfoxacademy.my_brilliant_thoughts.models.Thought;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThoughtRepository extends CrudRepository<Thought, Long> {
  List<Thought> findAll();
}
