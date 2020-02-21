package com.bancoazteca.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableStubLoggingFilter
public class ApiTransaccionesApplication {
	
	public static void main(String[] args) {
		System.setProperty("ambiente", "desarrollo");
		SpringApplication.run(ApiTransaccionesApplication.class, args);
	}

}
