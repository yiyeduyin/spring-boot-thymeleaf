package com.c.springbootthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:/application.properties")
public class SpringBootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafApplication.class, args);
	}
}
