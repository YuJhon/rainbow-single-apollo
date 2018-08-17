package com.rainbow.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br>获取appInfo信息接口</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-apollo
 * @date 2018/8/17 10:26
 */
@Slf4j
@RestController
public class AppInfoController {

  @Value("${app.secret}")
  private String secret;

  @Value("${app.name}")
  private String name;

  @GetMapping("/")
  public String appInfo() {
    return "Hello, Secret : " + secret + ",  app name: " + name;
  }
}
