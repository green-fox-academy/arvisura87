package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  PrinterService service;

  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
    service.log("Tamás");
  }
}
