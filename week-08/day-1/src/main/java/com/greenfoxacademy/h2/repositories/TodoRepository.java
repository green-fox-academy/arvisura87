package com.greenfoxacademy.h2.repositories;

import com.greenfoxacademy.h2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
