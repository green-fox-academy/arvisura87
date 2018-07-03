package com.greenfoxacademy.h2.models;

import lombok.Data;

@Data
public class Todo {

  //(id:Long, title:String, urgent:boolean(default false), done:boolean(default false)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(Long id, String title) {
    this.id = id;
    this.title = title;
    urgent = false;
    done = false;
  }
}
