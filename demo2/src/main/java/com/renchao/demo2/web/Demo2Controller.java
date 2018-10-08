package com.renchao.demo2.web;

import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo2")
public class Demo2Controller {

  @Value("${message}")
  private String message;

  @GetMapping("/message")
  public String getMessage(){
    return message;
  }

}
