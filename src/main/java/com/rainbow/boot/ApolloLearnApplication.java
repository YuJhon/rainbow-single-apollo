package com.rainbow.boot;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;

@EnableDiscoveryClient
@EnableApolloConfig
@EnableZuulProxy
@SpringBootApplication
public class ApolloLearnApplication {

  public static void main(String[] args) throws Exception {
    /** 设置盐值(可以配置到配置文件中) **/
    System.setProperty("jasypt.encryptor.password", "saltValue");
    ApplicationContext context = SpringApplication.run(ApolloLearnApplication.class, args);
  }
}
