package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

  @Autowired
  private PostRepository postRepository;

  @GetMapping("")
  public String index(Model model) {
    model.addAttribute("postList", postRepository.findAll());
    return "index";
  }

  @GetMapping
  public String post(Model model) {
    model.addAttribute(new Post());
    return "submit";
  }

  @PostMapping
  public String submitPost(@ModelAttribute Post post) {
    postRepository.save(post);
    return "redirect:";
  }
}

