package com.cardapio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardapioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardapioApplication.class, args);

		System.out.println("==============================");
		System.out.println("======Servico em Execucao=====");
		System.out.println("==============================");
	}

}