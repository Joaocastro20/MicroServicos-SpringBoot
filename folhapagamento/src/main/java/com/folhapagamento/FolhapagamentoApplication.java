package com.folhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class FolhapagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhapagamentoApplication.class, args);
	}

}
