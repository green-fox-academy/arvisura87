package com.greenfoxacademy.my_brilliant_thoughts.controllers;

import com.greenfoxacademy.my_brilliant_thoughts.services.ThoughtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainRestController {

  @Autowired
  ThoughtService thoughtService;

  @GetMapping("/")
  public List thoughtsList() {
    return thoughtService.getAllThoughts();
  }

  @PostMapping("/")
  public List saveNew(@RequestBody(required = true) String thoughText) {
    thoughtService.saveNew(thoughText);
    return thoughtService.getAllThoughts();
  }
}
