package com.Api.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public String saludo (String nombre) {
		return nombre;
	}

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DemoApplication app = context.getBean(DemoApplication.class);
		System.out.println(app.saludo("Jemerson Dato actualizado"));
	}

}
