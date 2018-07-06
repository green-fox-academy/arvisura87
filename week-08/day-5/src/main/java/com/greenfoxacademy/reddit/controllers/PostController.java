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

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("postList", postRepository.findAll());
    return "index";
  }

  @GetMapping("/submit")
  public String post(Model model) {
    Post post = new Post();
    model.addAttribute(post);
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(@ModelAttribute Post post) {
    postRepository.save(post);
    return "redirect:/";
  }
}

