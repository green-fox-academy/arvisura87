package com.greenfoxacademy.bankOfSimba.controllers;

import com.greenfoxacademy.bankOfSimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ShowController {

  private BankAccount bankAccount;
  private List<BankAccount> bankAccountList;

  @GetMapping("/show")
  public String showShowPage(Model model) {
    bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute(bankAccount);

    return "show";
  }

  @GetMapping("/htmlcaption")
  public String showHtmlCaption(Model model) {
    String captionText = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("captionText", captionText);

    return "htmlcaption";
  }

  @GetMapping("/listaccounts")
  public String showListOfAccounts(Model model) {
    BankAccount zordon = new BankAccount("Zordon", 3000, "lion");
    BankAccount nala = new BankAccount("Nala", 500, "lion");
    BankAccount muszafa = new BankAccount("Muszafa", 5000, "lion");
    BankAccount rafiki = new BankAccount("Rafiki", 300, "monkey");
    BankAccount zazu = new BankAccount("Zazu", 100, "parrot");

    bankAccountList = new ArrayList<>();
    bankAccountList = Arrays.asList(zordon, nala, muszafa, rafiki, zazu);
    model.addAttribute("bankAccountList", bankAccountList);

    return "listaccounts";
  }
}
