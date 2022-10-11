package com.in2it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientdemoApplication.class, args);
	}
}
