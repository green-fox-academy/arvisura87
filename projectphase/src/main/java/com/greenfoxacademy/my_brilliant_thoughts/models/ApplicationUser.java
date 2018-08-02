package com.greenfoxacademy.my_brilliant_thoughts.models;

public class ApplicationUser {

  private String username;
  private String userPassword;

  public ApplicationUser() {
  }

  public ApplicationUser(String username, String userPassword) {
    this.username = username;
    this.userPassword = userPassword;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }
}
