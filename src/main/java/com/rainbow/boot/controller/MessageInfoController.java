package com.rainbow.boot.controller;

import com.rainbow.boot.config.ApolloMessageUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br>消息处理器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-apollo
 * @date 2018/8/17 13:50
 */
@RestController
public class MessageInfoController {

  /**
   * <pre>获取国际化配置的对应信息</pre>
   *
   * @return
   */
  @GetMapping("/msg")
  public String hello() {
    String chMsg = ApolloMessageUtil.getMessage("welcome", "zh_cn");
    String enMsg = ApolloMessageUtil.getMessage("welcome", "en");
    return "EnMsg: " + enMsg + "，ChMsg: " + chMsg;
  }

}
