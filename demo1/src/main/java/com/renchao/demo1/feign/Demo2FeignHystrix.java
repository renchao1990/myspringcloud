package com.renchao.demo1.feign;

import org.springframework.stereotype.Component;

@Component
public class Demo2FeignHystrix implements Demo2Feign {

  @Override
  public String getMessage() {
    return "demo2服务调用失败";
  }
}
