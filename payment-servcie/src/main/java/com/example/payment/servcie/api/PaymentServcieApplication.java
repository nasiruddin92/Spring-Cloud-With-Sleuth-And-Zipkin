package com.example.payment.servcie.api;

import org.aspectj.lang.annotation.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PaymentServcieApplication {

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate(  );
	}

	public static void main(String[] args) {
		SpringApplication.run(PaymentServcieApplication.class, args);
	}

}
