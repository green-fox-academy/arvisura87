package com.greenfoxacademy.week9day1.models;

public class Until {

  private int until;

  public Until() {
    this(15);
  }

  public Until(int until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
