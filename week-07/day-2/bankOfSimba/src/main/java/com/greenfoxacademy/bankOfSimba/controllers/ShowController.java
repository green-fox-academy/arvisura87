package com.greenfoxacademy.bankOfSimba.controllers;

import com.greenfoxacademy.bankOfSimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {

  private BankAccount bankAccount;

  @GetMapping("/show")
  public String showShowPage(Model model) {
    bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute(bankAccount);

    return "show";
  }
}
