package com.zheng.nie.urule.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:urule-core-context.xml"})
public class UruleClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UruleClientApplication.class, args);
	}

}
