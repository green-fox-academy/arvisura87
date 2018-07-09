package com.greenfoxacademy.week9day1.models;

public class Appenda {

  private String appended;

  public Appenda(String text) {
    appended = text + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
