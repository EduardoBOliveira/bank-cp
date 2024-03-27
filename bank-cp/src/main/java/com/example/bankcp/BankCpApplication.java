package com.example.bankcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BankCpApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCpApplication.class, args);
	}

	@RestController
	class  Mebros{
		@GetMapping("/")
		public String index() {
			return "BankCp João Vitor Vicente e Eduardo Bezerra";
	}
}
}
