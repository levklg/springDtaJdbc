package com.example.springDataJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringDataJdbcApplication.class, args);
		context.getBean("homeWork", HomeWork.class).action();
	}

}
