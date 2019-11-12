package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
public class SpringboothelloApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(SpringboothelloApplication.class, args);
		//如果pom中使用的是<artifactId>spring-boot-starter-web</artifactId>,那么就不用要下面这行代码
		new CountDownLatch(1).await();
	}
}
