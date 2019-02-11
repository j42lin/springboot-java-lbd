package com.tribalscale.springbootjavalbd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.tribalscale.springbootjavalbd.models.Todo;
import com.tribalscale.springbootjavalbd.services.TodoService;

import lombok.Getter;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonRootName;

@RestController
@RequestMapping(path = "/todo")
public class TodoController {
  private TodoService todoService;
  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping
  public List<Todo> getTodos() {
    return todoService.getTodoList();
  }
  
  @PostMapping
  public List<Todo> postMethodName(@Valid @RequestBody TodoBody todoBody) {
      //TODO: process POST request
      return todoService.createTodo(todoBody.getText(), todoBody.getPriority());
  } 
}

@JsonRootName("todo")
@Getter
@NoArgsConstructor
class TodoBody {
  @NotBlank (message = "can't be blank")
  private String text;
  @NotBlank (message = "can't be blank")
  private int priority;
}