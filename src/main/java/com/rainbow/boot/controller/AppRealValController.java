package com.rainbow.boot.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br>实时获取配置信息</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-apollo
 * @date 2018/8/17 11:25
 */
@RestController
public class AppRealValController {
  // 方式一
  //private Config config = ConfigService.getAppConfig();
  // 方式二
  @ApolloConfig
  private Config config;

  /**
   * <pre>获取实时的配置信息</pre>
   *
   * @return
   */
  @GetMapping("/real")
  public String appInfo() {
    String appSecret = config.getProperty("app.secret", "");
    String appName = config.getProperty("app.name", "");
    return "Hello, Secret : " + appSecret + ",  app name: " + appName;
  }

}
