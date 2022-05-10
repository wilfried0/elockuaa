package com.assam.elockuaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.assam")
public class ElockuaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElockuaaApplication.class, args);
	}

}
