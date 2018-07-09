package com.greenfoxacademy.week9day1.controllers;

import com.greenfoxacademy.week9day1.models.Doubling;
import com.greenfoxacademy.week9day1.models.Error;
import org.springframework.web.bind.annotation.GetMapping;
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
}
