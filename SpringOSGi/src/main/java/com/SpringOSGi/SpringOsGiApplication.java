package com.SpringOSGi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringOsGiApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringOsGiApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");	}

}
