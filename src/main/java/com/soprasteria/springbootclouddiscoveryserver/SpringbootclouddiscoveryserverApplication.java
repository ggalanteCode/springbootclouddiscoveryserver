package com.soprasteria.springbootclouddiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootclouddiscoveryserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootclouddiscoveryserverApplication.class, args);
	}

}
