package com.rainbow.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br>日志配置刷新的控制器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-apollo
 * @date 2018/8/17 15:44
 */
@RestController
public class LogConfigRefreshController {

  private static Logger logger = LoggerFactory.getLogger(LogConfigRefreshController.class);

  @GetMapping("/log")
  public String hello() {
    logger.info("info--------------");
    logger.error("error--------------");
    logger.warn("warn--------------");
    logger.debug("debug--------------");
    return "Hello,World";
  }
}
