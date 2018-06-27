package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {

  @Autowired
  UtilityService service;

  @GetMapping("/useful")
  public String showUseful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showColored(Model model) {
    model.addAttribute("color", service.randomColor());

    return "colored";
  }
}
