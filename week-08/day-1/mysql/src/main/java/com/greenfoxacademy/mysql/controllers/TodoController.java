package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping(value={"/", "/list"})
  public String list(Model model, @RequestParam(value = "isDone", required = false) boolean isDone) {
    if (isDone) {
      model.addAttribute("todoList", todoRepository.findByDone(true));
    } else {
      model.addAttribute("todoList", todoRepository.findByDone(false));
    }
    return "todolist";
  }
}
