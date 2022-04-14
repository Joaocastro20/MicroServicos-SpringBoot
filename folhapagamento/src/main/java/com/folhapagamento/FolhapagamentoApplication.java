package com.folhapagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "trabalhadores")
public class FolhapagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhapagamentoApplication.class, args);
	}

}
