package com.greenfoxacademy.my_brilliant_thoughts.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Thought {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String text;
  private long timestamp;

  public Thought() {
  }

  public Thought(String text) {
    this.text = text;
    timestamp = System.currentTimeMillis() / 1000;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
