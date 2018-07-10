package com.greenfoxacademy.week9day1.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.greenfoxacademy.week9day1.models.*;
import com.greenfoxacademy.week9day1.models.Error;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable String what,
                        @RequestBody (required = false) Until until) {

    if (until == null) {
      Error error = new Error("Please provide a number!");
      return error;
    }

    if (what.length() > 3) {
      int factor = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        factor *= i;
      }
      Result result = new Result(factor);
      return result;
    } else {
      int sum = 0;
      for (int i = 1; i <= until.getUntil(); i++) {
        sum += i;
      }
      Result result = new Result(sum);
      return result;
    }
  }
}
