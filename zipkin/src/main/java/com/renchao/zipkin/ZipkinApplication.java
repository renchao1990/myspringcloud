package com.renchao.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * ZIPKIN
 * 链路追踪服务
 * 依赖于EUREKA服务和SPRING CLOUD CONFIG服务
 * http://localhost:1015 查看监控页面
 */
@EnableDiscoveryClient
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZipkinApplication.class, args);
  }

}
