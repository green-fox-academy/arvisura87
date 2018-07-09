package com.greenfoxacademy.week9day1.controllers;

import com.greenfoxacademy.week9day1.models.Appenda;
import com.greenfoxacademy.week9day1.models.Doubling;
import com.greenfoxacademy.week9day1.models.Error;
import com.greenfoxacademy.week9day1.models.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling(input);
      return doubling;
    } else {
      Error error = new Error("Please provide an input!");
      return error;
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                        @RequestParam(name = "title", required = false) String title){

    if (name == null) {
      Error error = new Error("Please provide a name!");
      return error;
    } else if (name != null && title == null) {
      Error error = new Error("Please provide a title!");
      return error;
    } else {
      Greet greet = new Greet(name, title);
      return greet;
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appenda(@PathVariable String appendable) {
    Appenda appenda = new Appenda(appendable);
    return appenda;
  }
}
