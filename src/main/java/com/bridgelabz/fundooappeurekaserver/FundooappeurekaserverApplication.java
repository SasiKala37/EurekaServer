package com.bridgelabz.fundooappeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FundooappeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundooappeurekaserverApplication.class, args);
	}
}
