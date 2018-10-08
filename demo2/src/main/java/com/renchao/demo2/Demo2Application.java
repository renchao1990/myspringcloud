package com.renchao.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * DEMO2
 * 服务提供者
 * 依赖于EUREKA和SPRING CLOUD CONFIG
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Demo2Application {

  public static void main(String[] args) {
    SpringApplication.run(Demo2Application.class, args);
  }



}
