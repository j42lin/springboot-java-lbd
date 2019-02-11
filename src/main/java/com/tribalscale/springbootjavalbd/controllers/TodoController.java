package com.tribalscale.springbootjavalbd.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;
import com.tribalscale.springbootjavalbd.models.Todo;

@RestController
public class TodoController {
  @GetMapping(value="/")
  public String get() {
    return "helloworld";
  }

  @GetMapping(value="/todo")
  public List<Todo> getTodos() {
    Todo todo = new Todo("dfd", 1);
    return Arrays.asList(
      todo
    );
  }
  
  
}