package com.tribalscale.springbootjavalbd.models;

import lombok.Data;

@Data
public class Todo {
  private String text;
  private int priority;

  public Todo(String text, int priority) {
    this.text = text;
    this.priority = priority;
  }
}