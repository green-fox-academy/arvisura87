package com.greenfoxacademy.week9day1.models;

public class Error {

  private String error;

  public Error(String message) {
    error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
