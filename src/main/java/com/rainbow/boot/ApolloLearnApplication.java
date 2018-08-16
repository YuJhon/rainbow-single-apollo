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
		SpringApplication.run(ApolloLearnApplication.class, args);
	}
}
