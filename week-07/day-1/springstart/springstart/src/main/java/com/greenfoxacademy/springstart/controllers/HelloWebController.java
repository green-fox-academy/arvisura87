package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam(value = "name") String name, Model model) {
    Greeting greeting = new Greeting(atomicLong.getAndIncrement(), "Hello " + name);
    model.addAttribute("name", " World");
    model.addAttribute("count", greeting.getId());
    return "greeting";
  }
}
