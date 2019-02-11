package com.tribalscale.springbootjavalbd.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.tribalscale.springbootjavalbd.models.Todo;

@Service
public class TodoService {
  private static List<Todo> todoList = new ArrayList<Todo> ();

  public List<Todo> createTodo(String text, int priority) {
    Todo newTodo = new Todo(text, priority);
    TodoService.todoList.add(newTodo);
    return TodoService.todoList;
  }

  public List<Todo> getTodoList() {
    return TodoService.todoList;
  }
}