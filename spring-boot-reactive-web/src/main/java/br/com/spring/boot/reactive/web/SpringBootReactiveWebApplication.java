package br.com.spring.boot.reactive.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.spring.boot.reactive.web")
public class SpringBootReactiveWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactiveWebApplication.class, args);
	}
}
