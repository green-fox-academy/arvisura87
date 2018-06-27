package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red");
  }
}
