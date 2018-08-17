package com.rainbow.boot;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableApolloConfig
@SpringBootApplication
public class ApolloLearnApplication {

  public static void main(String[] args) {
    /** 设置盐值(可以配置到配置文件中) **/
    System.setProperty("jasypt.encryptor.password", "saltValue");
    SpringApplication.run(ApolloLearnApplication.class, args);
  }
}
