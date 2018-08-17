package com.rainbow.boot.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.rainbow.boot.ApolloLearnApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * <p>功能描述</br>zuul配置更新监听器</p>
 *
 * @author jiangy19
 * @version v1.0
 * @projectName rainbow-apollo
 * @date 2018/8/17 17:20
 */
@Component
public class ZuulPropertiesRefresher {
  private static final Logger logger = LoggerFactory.getLogger(ZuulPropertiesRefresher.class);

  @Autowired
  private RefreshScope refreshScope;

  @ApolloConfigChangeListener
  public void onChange(ConfigChangeEvent changeEvent) {
    boolean zuulPropertiesChanged = false;
    for (String changedKey : changeEvent.changedKeys()) {
      if (changedKey.startsWith("zuul.")) {
        zuulPropertiesChanged = true;
        break;
      }
    }

    if (zuulPropertiesChanged) {
      logger.info("Refreshing zuul properties!");
      refreshScope.refresh(ZuulConfigBean.ZUUL_PROPERTIES_BEAN);
    }
  }

}
