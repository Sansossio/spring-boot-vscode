package com.example.demo.controller;

import com.example.demo.dto.ExampleDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
  @GetMapping
  public ExampleDto hello() {
    ExampleDto response = new ExampleDto();
    response.setName("Hello World");
    return response;
  }
}
