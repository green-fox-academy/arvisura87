package com.greenfoxacademy.mysql.repositories;

import com.greenfoxacademy.mysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
