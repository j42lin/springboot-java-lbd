package com.tribalscale.springbootjavalbd.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {
  @GetMapping(value="/")
  public String get() {
      return "helloworld";
  }
  
}