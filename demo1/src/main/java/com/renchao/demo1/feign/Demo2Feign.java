package com.renchao.demo1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "${application.demo2.name:demo2}",
    path = "${application.demo2.path:/demo2}",
    fallback = Demo2FeignHystrix.class) //启用Hystrix熔断器控制
public interface Demo2Feign {

  @GetMapping("/message")
  String getMessage();



}
