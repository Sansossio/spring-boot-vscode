package com.example.demo.dto;

import org.springframework.stereotype.Component;

@Component
public class ExampleDto {
  private String name;
  private String message;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
