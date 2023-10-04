package com.example.testspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping(value = "/test")
  public String sayHello() {
    return "Hi";
  }
}
