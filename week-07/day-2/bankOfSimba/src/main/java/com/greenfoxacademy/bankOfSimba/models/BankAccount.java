package com.greenfoxacademy.bankOfSimba.models;

public class BankAccount {

  private String name;
  private String animalType;
  private Double balance;
  private String balanceWithCurrency;
  private String isKing;

  public BankAccount(String name, double balance, String animalType, String isKing) {
    this.name = name;
    this.animalType = animalType;
    this.balance = balance;
    balanceWithCurrency = String.format("%.2f Zebra", balance);
    this.isKing = isKing;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public String getBalanceWithCurrency() {
    return balanceWithCurrency;
  }

  public void setBalanceWithCurrency(String balanceWithCurrency) {
    this.balanceWithCurrency = balanceWithCurrency;
  }

  public String getIsKing() {
    return isKing;
  }

  public void setIsKing(String isKing) {
    this.isKing = isKing;
  }
}
