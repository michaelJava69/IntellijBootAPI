package org.rbsg.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 * This class although very simple looking has a lot going on.  First, it’s been
 * annotated with the @SpringBootApplication annotation. This declares the class
 * as a @Configuration class for your application.  You can define additional @Bean
 * definitions in it if you like.  It adds @ComponentScan to locate any other beans
 * you define in your project.  Finally it adds @EnableAutoConfiguration in order to
 * enable automatic configuration of your Spring application context by determining
 * what you have available on your classpath.
 *
 */
@ComponentScan({"org.rbsg.controller"})
@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}
