package com.zheng.nie.urule.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:urule-console-context.xml"})
public class UruleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UruleServerApplication.class, args);
	}

}
