package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping(value={"/", "/list"})
  public String list(Model model, @RequestParam(value = "isDone", required = false) Boolean isDone) {
    if (isDone == null) {
      model.addAttribute("todoList", todoRepository.findAll());
    } else {
      model.addAttribute("todoList", todoRepository.findByDone(isDone));
    }
    return "todolist";
  }

  @GetMapping("/add")
  public String add(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String sumbit(@ModelAttribute Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }
}
