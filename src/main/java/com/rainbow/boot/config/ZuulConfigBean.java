package com.rainbow.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * <p>功能描述</br>zuul的配置信息</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-apollo
 * @date 2018/8/17 17:40
 */
@Configuration
public class ZuulConfigBean {

  public static final String ZUUL_PROPERTIES_BEAN = "ZUUL_PROPERTIES_BEAN";

  public static final String ZUUL_PREFIX = "zuul";

  /**
   * <pre>网关配置</pre>
   *
   * @return
   */
  @Primary
  @Bean(ZUUL_PROPERTIES_BEAN)
  @RefreshScope
  @ConfigurationProperties(ZUUL_PREFIX)
  public ZuulProperties zuulProperties() {
    return new ZuulProperties();
  }
}
