package com.renchao.demo1.web;

import com.renchao.demo1.feign.Demo2Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo1")
public class Demo1Controller {

  @Value("${message}")
  private String message;

  @Autowired
  private Demo2Feign demo2Feign;

  @GetMapping("/message")
  public String getMessage(){
    return message;
  }

  @GetMapping("/message/demo2")
  public String getDemo2Message(){
    return demo2Feign.getMessage();
  }



}
