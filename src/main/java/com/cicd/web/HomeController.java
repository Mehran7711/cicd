package com.cicd.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//  @GetMapping
//  public String hello() {
//    return "Hello from Here!";
//  }

  @GetMapping
  public String hello() {
    return "Hello from Here!";
  }
}
