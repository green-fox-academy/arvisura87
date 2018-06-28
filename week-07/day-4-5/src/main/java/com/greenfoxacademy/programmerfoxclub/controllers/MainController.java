package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String postLogin(@RequestParam(value = "name") String name) {
    return "redirect:/" + name;
  }

  @GetMapping("")
  public String renderProfilePage(@RequestParam(value = "name", required = false) String name) {
    return "index";
  }
}
