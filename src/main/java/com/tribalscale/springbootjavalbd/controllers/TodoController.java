package com.tribalscale.springbootjavalbd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;
import com.tribalscale.springbootjavalbd.models.Todo;
import com.tribalscale.springbootjavalbd.services.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TodoController {
  private TodoService todoService;
  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  @GetMapping(value="/")
  public String get() {
    return "helloworld";
  }

  @GetMapping(value="/todo")
  public List<Todo> getTodos() {
    return todoService.getTodoList();
  }
  
  @PostMapping(value="/todo")
  public List<Todo> postMethodName(@RequestBody String text, int priority) {
      //TODO: process POST request
      return todoService.createTodo(text, priority);
  } 
}