package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

  @Autowired
  PrinterService service;

  @Override
  public void printColor() {
    service.log("Its blue");
  }
}
